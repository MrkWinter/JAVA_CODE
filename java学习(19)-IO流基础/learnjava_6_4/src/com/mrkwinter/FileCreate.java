package com.mrkwinter;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileCreate {
    //演示创建文件
    public static void main(String[] args) {

    }
    //
    @Test
    public void create01() {
        File file = new File("text.txt"); //在内存中创建
        try {
            file.createNewFile(); //创建文件 在磁盘中
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void create02() {
        File file = new File("file/");
        File file1 = new File(file, "test.txt"); //根据父目录 创建目录下的文件
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void create03() {
        File file = new File("file", "test2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
