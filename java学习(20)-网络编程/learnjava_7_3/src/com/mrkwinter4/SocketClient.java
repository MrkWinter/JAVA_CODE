package com.mrkwinter4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello,server\n");
        bufferedWriter.newLine(); //设置写入结束标记
        bufferedWriter.flush();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        line = bufferedReader.readLine();
        System.out.println(line);
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
