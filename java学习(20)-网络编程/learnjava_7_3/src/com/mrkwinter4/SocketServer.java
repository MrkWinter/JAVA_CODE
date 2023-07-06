package com.mrkwinter4;

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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        line = bufferedReader.readLine();
        System.out.println(line);
        line = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine(); //设置写入结束标记
        bufferedWriter.flush();
        //关流要在最后
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
