package com.homework03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        //接收到歌曲名
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String musicName = bufferedReader.readLine();
        System.out.println(musicName);
        socket.shutdownInput();

        //传出歌曲
        String musicPath = "Server\\" + musicName;
        String isExists = "下载完成";
        if(!new File(musicPath).exists()) {
            musicPath = "Server\\我记得.ogg";
            isExists = "下载失败，未找到对应歌曲，已下载默认歌曲";
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(musicPath));
        byte[] bytes = new byte[1024];
        int count;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        while ((count = bufferedInputStream.read(bytes))!= -1) {
            bufferedOutputStream.write(bytes,0,count);
        }
        bufferedOutputStream.flush();
        socket.shutdownOutput();

//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bufferedWriter.write(isExists);
//        bufferedWriter.flush();
//        socket.shutdownOutput();
//        bufferedWriter.close();

        bufferedReader.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}
