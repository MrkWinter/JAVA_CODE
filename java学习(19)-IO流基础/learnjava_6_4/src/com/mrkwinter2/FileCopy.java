package com.mrkwinter2;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {

    }
    @Test
    public void fileCopy() throws IOException {
        String srcFile = "file\\aili.jpg";//？？如何拷贝到文件夹下
        String destFile = "file2\\aili.jpg";
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);//拷贝到文件夹下 文件名为aili.jpg 若无则创建
        byte[] arr = new byte[8]; // 一次拷贝多个 提高效率
        int length;
        while((length = fileInputStream.read(arr))!=-1) {
            fileOutputStream.write(arr,0,length);//通过字节数组 实现拷贝图片
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
