package com.mrkwinter3;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FireWriter01 {
    public static void main(String[] args) {

    }
    @Test
    public void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("fileWriter.txt");
        //1. 写入字符
        fileWriter.write('a');
        //2. 写入字符串
        String str = "nihaowoshi";
        fileWriter.write(str,0,str.length());
        //3. 写入字符数组
        char arr[] = str.toCharArray();
        fileWriter.write(arr,0, arr.length/2);
        fileWriter.flush();
        fileWriter.close();
    }
}
