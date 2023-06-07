package com.mrkwinter3;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileReader01 {
    public static void main(String[] args) {

    }

    @Test
    public void fileReader() throws IOException {
        FileReader fileReader = new FileReader("hello.txt");
        //1. read单读
        int a;
        while ((a = fileReader.read()) != -1) {
            System.out.print((char) a);//每调用一次read()指针就向下一移动一次
            //所以这里用变量接收
        }
        //2. read快读
        char arr[] = new char[8];
        int length;
        while ((length = fileReader.read(arr)) != -1) {
            System.out.print(new String(arr, 0, length));
        }
        fileReader.close();
    }
}
