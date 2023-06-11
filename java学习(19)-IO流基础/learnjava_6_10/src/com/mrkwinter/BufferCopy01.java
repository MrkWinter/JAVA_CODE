package com.mrkwinter;

import java.io.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class BufferCopy01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));
        String s;
        while( (s=bufferedReader.readLine()) != null) {
            //读取的一行字符串不包含换行符
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
