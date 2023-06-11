package com.mrkwinter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class BufferWriter01 {
    public static void main(String[] args) throws IOException {
        String filePath = "text.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        //可以在结点流上加上true 表示追加
        bufferedWriter.write("你好 你好 你好 你好 你好"); //写入字符串
        bufferedWriter.write('\n'); //写入字符
        bufferedWriter.write("你好");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("你好");
        bufferedWriter.close();
    }
}
