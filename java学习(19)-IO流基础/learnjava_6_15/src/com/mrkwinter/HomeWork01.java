package com.mrkwinter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File mytemp = new File("mytemp");
        if (!mytemp.exists())
            mytemp.mkdir();
        File file1 = new File("mytemp", "hello.txt");
        if (!file1.exists()) {
            file1.createNewFile();
            FileWriter fileWriter = new FileWriter(file1);
            fileWriter.write("hello，world");
            fileWriter.close();
        }
        else
            System.out.println("文件已存在");
    }
}
