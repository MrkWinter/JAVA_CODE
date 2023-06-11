package com.mrkwinter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class BufferReader01 {
    public static void main(String[] args) throws IOException {
        String filePath = "text.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //传入结点流 在内部处理
        String buf;
        while((buf = bufferedReader.readLine())!=null) { //.readLine() 一次读取一行
            System.out.println(buf);
        }
        bufferedReader.close();//关闭外部流 自动调用传入的结点流
    }
}
