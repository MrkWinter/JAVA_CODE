package com.homework03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("192.168.43.118"), 9999);
        //输入歌曲名
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner scanner = new Scanner(System.in);
        String musicName = scanner.next();
        bufferedWriter.write(musicName);
        bufferedWriter.flush();
        socket.shutdownOutput();

        //接收下载歌曲
        if(musicName.substring(musicName.length()-4,musicName.length()) != ".ogg") {
            musicName += ".ogg";
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int count;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("Client\\" + musicName));
        while ((count = bufferedInputStream.read(bytes))!=-1) {
            bufferedOutputStream.write(bytes,0,count);
        }
        bufferedOutputStream.flush();
        socket.shutdownInput();

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String s = bufferedReader.readLine();
//        System.out.println(s);
//        socket.shutdownInput();
//        bufferedReader.close();

        bufferedWriter.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
