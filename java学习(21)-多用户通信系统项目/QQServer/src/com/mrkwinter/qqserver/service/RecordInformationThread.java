package com.mrkwinter.qqserver.service;

import com.mrkwinter.qqcommon.Message;
import com.sun.corba.se.pept.protocol.MessageMediator;

import javax.swing.text.AbstractDocument;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Iterator;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class RecordInformationThread extends Thread {
    private Message message;

    public RecordInformationThread(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        boolean loop = true;
        while (loop) {
            Iterator<String> iterator = ManageServerConnectClientThread.getHp().keySet().iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                if(s.equals(message.getGetterName())) { //找到用户， 用户上线
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(ManageServerConnectClientThread.getServerThread(s).getSocket().getOutputStream());
                        oos.writeObject(message); //写入通道
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    loop = false;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
