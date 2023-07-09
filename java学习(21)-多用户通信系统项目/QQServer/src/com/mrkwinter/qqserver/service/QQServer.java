package com.mrkwinter.qqserver.service;

import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;
import com.mrkwinter.qqcommon.User;
import jdk.net.Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class QQServer {
    private ServerSocket serverSocket = null;
    //创建集合存放多个用户可登录的
    private static ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();
    //创建集合存放多个message数据
    private static ConcurrentHashMap<String, ArrayList<Message>> recordMessages = new ConcurrentHashMap<>();

    static {
        users.put("100", new User("100", "123456"));
        users.put("200", new User("200", "123456"));
        users.put("300", new User("300", "123456"));
        users.put("400", new User("400", "123456"));
        users.put("500", new User("500", "123456"));
        users.put("600", new User("600", "123456"));
    }

    public QQServer() {
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务器端在9999端口监听");
            while (true) {
                Socket socket = serverSocket.accept();//连接到客户端返回一个sockets通道
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User user = (User) ois.readObject();//得到user对象
                //socket.shutdownInput(); //不用添加结束标志 为什么 ->可能是对象流有相关判定的结束方法

                //判断user对象是否正确
                Message message = new Message();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //写入通道message数据
                boolean isExist = ManageServerConnectClientThread.getServerThread(user.getUserId()) == null;
                if (checkUser(user) && isExist) { //线程不存在才允许 开启新线程
                    message.setMessageType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    oos.writeObject(message);
                    //开启服务端线程
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(user.getUserId(), socket);
                    serverConnectClientThread.start();
                    ManageServerConnectClientThread.addServerThread(user.getUserId(), serverConnectClientThread);

                } else {//登录失败
                    System.out.println("userId = " + user.getUserId() + "  passWd = " + user.getPassWd() + "验证失败");
                    message.setMessageType(MessageType.MESSAGE_LOGIN_FINAL);
                    oos.writeObject(message);
                    socket.close();
                    ois.close();
                    oos.close();
                }

                //ois.close(); 对应使用的流不能关 关闭会使socket关闭
                //oos.close();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static boolean checkUser(User user) {
        if (users.get(user.getUserId()) == null) {
            return false;
        }
        if (!users.get(user.getUserId()).getPassWd().equals(user.getPassWd())) {
            return false;
        }
        return true;
    }

    public static boolean isExistUser(String userId) {
        if (users.get(userId) == null) {
            return false;
        }
        return true;
    }

    public static void addRecordMessage(Message message) {
        if (recordMessages.get(message.getGetterName()) != null) {
            recordMessages.get(message.getGetterName()).add(message);
        } else {
            ArrayList<Message> arrayMessage = new ArrayList<>();
            arrayMessage.add(message);
            recordMessages.put(message.getGetterName(), arrayMessage);
        }
    }

    public static ArrayList<Message> getArrayMessage(String userId) {
        return recordMessages.get(userId);
    }
}
