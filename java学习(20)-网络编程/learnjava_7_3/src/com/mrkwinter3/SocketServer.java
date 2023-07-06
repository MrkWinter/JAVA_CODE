package com.mrkwinter3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int cont;
        while((cont = inputStream.read(bytes))!=-1) {
            System.out.println(new String(bytes,0,cont));
        }
        socket.shutdownInput(); //接收完
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();
        //关流要在最后
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
