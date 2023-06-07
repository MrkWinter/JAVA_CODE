package com.mrkwinter2;



import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileInputStream01 {
    public static void main(String[] args) {
        //FileInputStream-字节输入流  文件 -> 程序
        String filePath = "hello.txt";
        FileInputStream fileInputStream = null; //扩大作用域
        try {
            fileInputStream = new FileInputStream(filePath);
            while (fileInputStream.read() != -1) {  //每调用一次read()指针就向下一移动一次
                System.out.println((char) fileInputStream.read());
                //用read方法读一个 (一个一个的读)
            }

        } catch (IOException e) { //用IO异常捕获所有异常 new FileInputStream 和 read方法的异常
            throw new RuntimeException(e);
        } finally {
            //保证关闭流 因为占用资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
@Test
    public void fileInput() throws IOException { //直接抛出 效率较高
        String filePath = "hello.txt";
        FileInputStream fileInputStream = null; //扩大作用域
        byte[] buf = new byte[8];//用字符数组将读取 的内容先存储起来
        fileInputStream = new FileInputStream(filePath);
        int length; //用于存储读取的字节数来转换成对应的字符串
        while ((length = fileInputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,length));
            //用read方法读 多个字节一起读
        }
        fileInputStream.close();
    }
}
