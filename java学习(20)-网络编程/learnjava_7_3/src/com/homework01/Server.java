package com.homework01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = bufferedReader.readLine();
        System.out.println(line);
        socket.shutdownInput();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        if (line.equals("name")) {
            bufferedWriter.write("我是nova");
        } else if(line.equals("hobby")) {
            bufferedWriter.write("编写java程序");
        } else {
            bufferedWriter.write("啊？");
        }
        bufferedWriter.flush();
        socket.shutdownOutput();

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}
