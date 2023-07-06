package com.mrkwinter5;

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
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        //得到字节处理流 输出到socket通道
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("Client\\a.jpg"));
        byte[] bytes = new byte[1024];
        int count;
        while ((count = bufferedInputStream.read(bytes))!= -1) {
            bufferedOutputStream.write(bytes,0,count); //输出图片 写入数据通道
        }
        bufferedOutputStream.flush();
        socket.shutdownOutput(); //输出结束标记

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = bufferedReader.readLine();
        System.out.println(line); //接收标记

        bufferedInputStream.close();
        bufferedOutputStream.close();
        bufferedReader.close();
        socket.close();
    }
}
