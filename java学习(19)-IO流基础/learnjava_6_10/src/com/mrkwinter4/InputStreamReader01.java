package com.mrkwinter4;

import java.io.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class InputStreamReader01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader =
                new InputStreamReader(new FileInputStream("text.txt"),"gbk");
        //将字节流转换成字符流 并且指定编码 InputStreamReader 该字符流是Reader的子类 可用BufferedReader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s;
        while((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
