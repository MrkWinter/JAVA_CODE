package com.mrkwinter.qqframe;

import com.mrkwinter.qqserver.service.QQServer;
import com.mrkwinter.qqserver.service.SendNewServices;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class QQFrame {
    public static void main(String[] args) {
        Thread thread = new Thread(new SendNewServices());
        thread.start();
        QQServer qqServer = new QQServer();
    }
}
