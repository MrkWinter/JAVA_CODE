package com.mrkwinter2;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void fileOutInput() throws IOException {
        String path  = "a.txt";
        FileOutputStream fileOutputStream;
        //fileOutputStream = new FileOutputStream(path,);//重新写入会覆盖 (文件流的覆盖)
        fileOutputStream = new FileOutputStream(path,true);//append 属性改为true
        // 重复写入(执行程序)会(在原文件的基础上)追加
        //1. 写入一个字节
        fileOutputStream.write('a');
        //2. 写入一个字符串
        // 先把字符串转换成字节数组
        // 调用方法写入
        String test = "hello";
        fileOutputStream.write(test.getBytes()); //全部写入
        //重新写入会覆盖(重新执行程序内容一样)
        //这里并不是说重新使用write方法会将文件中原来内容清空
        //而是重新执行程序形成一个新的文件流时会清空重写
        fileOutputStream.write(test.getBytes(),0,3); //写前三个字节

        fileOutputStream.close();
    }
}
