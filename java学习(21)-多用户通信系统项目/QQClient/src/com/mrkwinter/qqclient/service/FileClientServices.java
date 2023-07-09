package com.mrkwinter.qqclient.service;

import com.mrkwinter.qqcommon.Message;
import com.mrkwinter.qqcommon.MessageType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileClientServices {
    public void sendFile(String src, String dest, String senderId, String getterId) {
        //读取文件 得到字节数组
        File file = new File(src);
        if (!file.exists()) {
            System.out.println("文件不存在");
            return;
        }
        //得到和文件相同大小的字节数组
        byte[] bytes;
        int length;
        try {
            bytes = new byte[(int) file.length()];
            FileInputStream fis = new FileInputStream(src);
            length = fis.read(bytes);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //创建信息对象
        Message message = new Message();
        message.setMessageType(MessageType.MESSAGE_FILE_MES);
        message.setBytes(bytes);
        message.setFileLength(length);
        message.setSrc(src);
        message.setDest(dest);
        message.setSenderName(senderId);
        message.setGetterName(getterId);
        message.setSendTime(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh:mm:ss").format(LocalDateTime.now()));

        //传递信息到通道
        try {
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("发送成功");
    }
}
