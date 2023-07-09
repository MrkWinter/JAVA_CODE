package com.mrkwinter.qqclient.service;

import java.util.HashMap;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ManageClientConnectServerThread {
    private static HashMap<String, ClientConnectServerThread> hp = new HashMap<>();

    public static void addClientThread(String userId,ClientConnectServerThread thread) {
        hp.put(userId,thread); //添加线程
    }
    public static ClientConnectServerThread getClientThread(String userId) {
       return hp.get(userId);//得到连接的线程
    }

    public static HashMap<String, ClientConnectServerThread> getHp() {
        return hp;
    }
}
