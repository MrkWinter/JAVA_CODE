package com.mrkwinter2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        //创建服务端监听端口9999
        System.out.println("端口9999正在监听");
        Socket socketAccept = serverSocket.accept();
        //接收端口后返回一个Socket对象 否则程序阻塞
        InputStream inputStream = socketAccept.getInputStream();
        //通过对象读取客户端输出的信息
        byte bf[] = new byte[1024];
        int length;
        while((length = inputStream.read(bf))!=-1 ) {
            System.out.println(new String(bf,0,length));
        }
        inputStream.close();
        socketAccept.close();
        serverSocket.close();
    }
}
