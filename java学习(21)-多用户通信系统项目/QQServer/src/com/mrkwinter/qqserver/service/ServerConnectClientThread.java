package com.mrkwinter.qqserver.service;

import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket = null;
    private String userId;

    public ServerConnectClientThread(String userId, Socket socket) {
        this.userId = userId;
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() { //服务端等待接收线程
        //发送记录的message信息
        ArrayList<Message> arrayMessage = QQServer.getArrayMessage(userId);
        if(arrayMessage!=null) {
            for (int i = 0; i <arrayMessage.size() ; i++) {
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(arrayMessage.get(i));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            arrayMessage.clear();
        }
        boolean index = true;
        while (index) {
            System.out.println("服务器端9999 和客户端 " + userId + " 正在保持通信");
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if (message.getMessageType().equals(MessageType.MESSAGE_GET_LIST)) {
                    //设置信息类型
                    System.out.println(message.getSenderName() + "请求获取在线列表");
                    Message message1 = new Message();
                    message1.setGetterName(message1.getSenderName());
                    message1.setMessageType(MessageType.MESSAGE_RET_LIST);
                    //设置返回信息的内容
                    String content = "";
                    Iterator<String> iterator = ManageServerConnectClientThread.getHp().keySet().iterator();
                    while (iterator.hasNext()) {
                        String next = iterator.next();
                        content += next + " ";
                    }
                    message1.setContent(content);
                    //发送列表信息
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message1);
                } else if (message.getMessageType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    //客户端退出 该线程应退出 该通道也应退出 同时告知客户端线程退出
                    //设置信息类型
                    Message message1 = new Message();
                    message1.setMessageType(MessageType.MESSAGE_CLIENT_EXIT);
                    //发送结束信息 告知结束
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message1);
                    //本线程结束
                    ManageServerConnectClientThread.getHp().remove(userId);
                    socket.close();
                    index = false;
                    System.out.println("服务器端和客户端 " + userId + " 通信结束");
                } else if (message.getMessageType().equals(MessageType.MESSAGE_PRIVATE_MES)) {
                    boolean loop = false;
                    Iterator<String> iterator = ManageServerConnectClientThread.getHp().keySet().iterator();
                    while (iterator.hasNext()) {
                        String next = iterator.next();
                        if (next.equals(message.getGetterName())) {
                            loop = true;
                        }
                    }
                    if (loop) { //有该用户
                        Socket socket1 = ManageServerConnectClientThread.getServerThread(message.getGetterName()).getSocket();
                        ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
                        oos.writeObject(message);
                    } else { //该用户不在
                        if(!QQServer.isExistUser(message.getGetterName())) {
                            message.setContent("无该用户");
                            Socket socket1 = ManageServerConnectClientThread.getServerThread(message.getSenderName()).getSocket();
                            ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
                            oos.writeObject(message);
                        } else {
//                            new RecordInformationThread(message).start();
                            QQServer.addRecordMessage(message);
                        }
                    }


//                    Set<String> strings = ManageServerConnectClientThread.getHp().keySet();
//                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//                    boolean loop = false;
//                    for (String s : strings) {
//                        if (message.getGetterName() != message.getSenderName() && s.equals(message.getGetterName())) {
//                            ObjectOutputStream oos2 = new ObjectOutputStream(ManageServerConnectClientThread.getServerThread(s).getSocket().getOutputStream());
//                            loop = true;
//                            oos.writeObject(message); ///error
//                        }
//                    }
//                    if(!loop) {
//                        message.setContent("未找到该对象，你个小丑");
//                        oos.writeObject(message);
//                    }


//                    if (loop) { //发送给别人
//                        oos.writeObject(message);
//                    } else { //发送给自己
//                        message.setContent("未找到该对象，你个小丑");
//                        oos.writeObject(message);
//                    }
                } else if (message.getMessageType().equals(MessageType.MESSAGE_PUBLIC_MES)) {
                    Set<String> strings = ManageServerConnectClientThread.getHp().keySet();
                    for (String s : strings) {
                        if (!s.equals(message.getSenderName())) { //字符串比较要用equals
                            message.setGetterName(s);
                            ObjectOutputStream oos = new ObjectOutputStream(ManageServerConnectClientThread.getServerThread(s).getSocket().getOutputStream());
                            oos.writeObject(message);
                        }
                    }
                } else if(message.getMessageType().equals(MessageType.MESSAGE_FILE_MES)) {
                    //传递文件
                    //得到对应的通道
                    boolean loop2 = false;
                    Iterator<String> iterator = ManageServerConnectClientThread.getHp().keySet().iterator();
                    while (iterator.hasNext()) {
                        String next = iterator.next();
                        if (next.equals(message.getGetterName())) {
                            loop2 = true;
                        }
                    }
                    if (loop2) { //有该用户
                        Socket socket1 = ManageServerConnectClientThread.getServerThread(message.getGetterName()).getSocket();
                        ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
                        oos.writeObject(message);
                    } else { //该用户不在
                        if(!QQServer.isExistUser(message.getGetterName())) {
                            message.setContent("无该用户");
                            Socket socket1 = ManageServerConnectClientThread.getServerThread(message.getSenderName()).getSocket();
                            ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
                            oos.writeObject(message);
                        } else {
//                            new RecordInformationThread(message).start();
                            QQServer.addRecordMessage(message);
                        }
                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
