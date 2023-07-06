package com.mrkwinter3;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int cont;
        while((cont = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,cont));
        }
        socket.shutdownInput();
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
