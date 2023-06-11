package com.mrkwinter2;

import java.io.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("heita.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("heita1.png"));
        byte[] bytes = new byte[8];
        int read;
        while ((read=bufferedInputStream.read(bytes))!=-1) {
            bufferedOutputStream.write(bytes,0,read);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
