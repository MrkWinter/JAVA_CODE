package com.mrkwinter3;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
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
        FileReader fileReader = new FileReader("hello.txt");
        FileWriter fileWriter = new FileWriter("hello2.txt");
        char arr[] = new char[8];
        int length;
        while((length=fileReader.read(arr))!=-1) {
            fileWriter.write(arr,0,length);
        }
        fileWriter.close();
        fileReader.close();
    }
}
