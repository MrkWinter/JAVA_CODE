package com.mrkwinter;

import sun.nio.cs.ext.GBK;

import java.io.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("hello1.txt"),"gbk"));
        String s;
        for (int i = 1;(s=bufferedReader.readLine())!=null; i++) {
            System.out.println(i +" " + s);
        }
        bufferedReader.close();
    }
}
