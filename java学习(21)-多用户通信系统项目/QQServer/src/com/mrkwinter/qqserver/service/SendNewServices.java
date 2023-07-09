package com.mrkwinter.qqserver.service;

import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;
import com.mrkwinter.qqcommon.User;
import com.mrkwinter.qqserver.service.utility.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class SendNewServices implements Runnable {
    @Override
    public void run() {

        while (true) {
            String news = Utility.readString(100);
            if (news.equals("[exit]")) {
                break;
            }
            Message message = new Message();
            message.setMessageType(MessageType.MESSAGE_PUBLIC_MES);
            message.setContent(news);
            message.setSenderName("000");
            message.setSendTime(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh:mm:ss").format(LocalDateTime.now()));

            //遍历线程通道
            Set<String> strings = ManageServerConnectClientThread.getHp().keySet();
            for (String s : strings) {
                message.setGetterName(s);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(ManageServerConnectClientThread.getServerThread(s).getSocket().getOutputStream());
                    objectOutputStream.writeObject(message);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
