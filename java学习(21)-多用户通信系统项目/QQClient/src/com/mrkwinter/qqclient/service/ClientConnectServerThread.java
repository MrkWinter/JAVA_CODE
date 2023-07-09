package com.mrkwinter.qqclient.service;

import com.mrkwinter.qqclient.utility.Utility;
import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;
import com.mrkwinter.qqcommon.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ClientConnectServerThread extends Thread {
    private Socket socket = null;
    private String userId = null;
   public ClientConnectServerThread(String userId, Socket socket) {
       this.userId = userId;
       this.socket = socket;
   }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() { //得到通道 用于一直等待服务器接收信息的线程
        boolean index = true;
        while (index) {
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if(message.getMessageType().equals(MessageType.MESSAGE_RET_LIST)) {
                    //如果返回的信息是在线列表信息
                    String[] s = message.getContent().split(" ");
                    System.out.println("--------当前在线列表为--------");
                    for (int i = 0; i < s.length; i++) {
                        System.out.print(s[i] + " ");
                    }
                    System.out.println("");
                } else if (message.getMessageType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    //返回的是退出信息 关闭通道 结束循环等待 关闭线程
                    ManageClientConnectServerThread.getHp().remove(userId);
                    socket.close();
                    index = false;
                } else if (message.getMessageType().equals(MessageType.MESSAGE_PRIVATE_MES)) {
                    System.out.println("发信人: " + message.getSenderName() + "  接收人(你): " + message.getGetterName());
                    System.out.println("发送时间：" + message.getSendTime());
                    System.out.println(message.getContent());
                } else if(message.getMessageType().equals(MessageType.MESSAGE_PUBLIC_MES)) {
                    System.out.println("发信人: " + message.getSenderName() + "  接收人(你): " + message.getGetterName());
                    System.out.println("发送时间：" + message.getSendTime());
                    System.out.println(message.getContent());
                } else if (message.getMessageType().equals(MessageType.MESSAGE_FILE_MES)) {
                    System.out.println("发送文件人: " + message.getSenderName() + "  接收人(你): " + message.getGetterName());
                    System.out.println("发送时间：" + message.getSendTime());
                    String dest = message.getDest();

//                    System.out.println("是否更改对方指定路径？(输入1进行更改)" + dest);
//                    int decide = Utility.readInt();
//                    if(decide == 1) {
//                        dest = Utility.readString(100);
//                    }

                    FileOutputStream fos = new FileOutputStream(dest);
                    fos.write(message.getBytes(),0,message.getFileLength());
                    fos.close();
                    System.out.println("文件接收成功,路径为" + dest);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
