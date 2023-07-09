package com.mrkwinter.qqclient.service;

import com.mrkwinter.qqclient.utility.Utility;
import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;
import com.mrkwinter.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Calendar;

/**
 * @author MrkWinter
 * @version 1.0
 * 该类完成用户登录验证和用户注册等功能
 */
public class UserClientService {
    private User user = null;
    private Socket socket = null;

    public boolean checkUser(String userId, String passWd) {
        boolean index = false; //标记 看是否成功
        user = new User(userId, passWd);
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(user); //将User对象写入通道
            //socket.shutdownOutput(); //不用添加结束标志 为什么 ->可能是对象流有相关判定的结束方法

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message message = (Message) ois.readObject(); //读取返回的message对象

            if (message.getMessageType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {
                index = true;
                //登录成功 启动线程
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(user.getUserId(),socket);
                clientConnectServerThread.start();
                //将线程放入 集合 便于操作
                ManageClientConnectServerThread.addClientThread(userId, clientConnectServerThread);
            } else {
                index = false;
                socket.close();
            }

//            oos.close(); 对应的流不能关 会使sockets通道关闭
//            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return index;
    }

    public void getOnlineList() {
        Message message = new Message();
        message.setSenderName(user.getUserId());
        message.setMessageType(MessageType.MESSAGE_GET_LIST);
        //获得本客户端sockets通道
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientThread(user.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message); //发送请求信息

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clientExist() {
        Message message = new Message();
        message.setMessageType(MessageType.MESSAGE_CLIENT_EXIT);
        //获得本客户端sockets通道
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientThread(user.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message); //发送请求信息

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
