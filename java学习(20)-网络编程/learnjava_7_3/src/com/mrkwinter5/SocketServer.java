package com.mrkwinter5;

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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("Server\\a.jpg"));
        byte[] bytes = new byte[1024];
        int count;
        while ((count = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, count); //写入磁盘
        }
        bufferedOutputStream.flush();
        socket.shutdownInput();//接收结束标记

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("接收写入成功");
        bufferedWriter.newLine();//输出结束标记
        bufferedWriter.flush();

        bufferedInputStream.close();
        bufferedOutputStream.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}
