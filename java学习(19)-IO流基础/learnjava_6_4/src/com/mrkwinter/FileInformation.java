package com.mrkwinter;

import org.junit.Test;

import java.io.File;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info() {
        File file = new File("file", "test.txt");

        //调用相关方法
        //1. 文件名字
        System.out.println(file.getName());
        //2. 文件绝对路径
        System.out.println(file.getAbsoluteFile());
        //3. 文件父级目录
        System.out.println(file.getParentFile());
        //4. 文件大小
        System.out.println(file.length());
        //5. 文件是否存在
        System.out.println(file.exists());
        //6. 文件是否为目录
        System.out.println(file.isDirectory());
        //7. 文件是否为文件
        System.out.println(file.isFile());
        String a = "wang";
    }

}
