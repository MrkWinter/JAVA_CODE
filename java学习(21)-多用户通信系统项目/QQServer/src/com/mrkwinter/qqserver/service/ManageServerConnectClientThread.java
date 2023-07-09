package com.mrkwinter.qqserver.service;

import java.util.HashMap;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ManageServerConnectClientThread {
    private static HashMap<String, ServerConnectClientThread> hp = new HashMap();
    public static void addServerThread(String userId,ServerConnectClientThread serverConnectClientThread) {
        hp.put(userId,serverConnectClientThread);
    }
    public static ServerConnectClientThread getServerThread(String userId) {
        return hp.get(userId);
    }

    public static HashMap<String, ServerConnectClientThread> getHp() {
        return hp;
    }
}
