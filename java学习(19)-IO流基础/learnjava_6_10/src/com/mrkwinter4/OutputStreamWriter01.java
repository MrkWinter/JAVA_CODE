package com.mrkwinter4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class OutputStreamWriter01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("text.txt", true),"gbk"));
        bufferedWriter.newLine();
        bufferedWriter.write("hi hi hi 想我了吗");
        bufferedWriter.close();
    }
}
