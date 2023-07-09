package com.mrkwinter.qqclient.service;

import com.mrkwinter.qqclient.utility.Utility;
import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author MrkWinter
 * @version 1.0
 * 提供和消息相关的方法
 */
public class MessageClientServices {
    public void privateSendMessage(String senderId,String getterId,String puMessage) {
        //封装私发信息包
        Message message = new Message();
        message.setMessageType(MessageType.MESSAGE_PRIVATE_MES);
        message.setSenderName(senderId);
        message.setGetterName(getterId);
        message.setContent(puMessage);
        message.setSendTime(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh:mm:ss").format(LocalDateTime.now()));

        //获得本客户端sockets通道
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message); //发送请求信息
            System.out.println("--------发送成功--------");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void publicSendMessage(String sendId,String prMessage) {
        Message message = new Message();
        message.setMessageType(MessageType.MESSAGE_PUBLIC_MES);
        message.setSenderName(sendId);
        message.setContent(prMessage);
        message.setSendTime(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh:mm:ss").format(LocalDateTime.now()));
        try{
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientThread(sendId).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println("--------群发成功--------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
