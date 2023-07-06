package com.mrkwinter2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //根据InetAddress对象(或域名)和端口 得到socket对象 用于信息传递
        OutputStream outputStream = socket.getOutputStream();
        //得到输出流
        outputStream.write("hello,world".getBytes());
        outputStream.close();
        socket.close();
    }
}
