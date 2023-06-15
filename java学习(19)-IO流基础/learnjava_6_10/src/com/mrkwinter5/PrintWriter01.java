package com.mrkwinter5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class PrintWriter01 {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        //套娃 printStream 转换成BufferedWriter 再转换成 PrintWriter 最终调用Writer类写入到目的位置
        //构造器将该out PrintStream 字节流 转换成 Writer字符流使用
        printWriter.print("你好");
        printWriter.close();
        PrintWriter test = new PrintWriter(new FileWriter("test.txt"));
        //根据构造器 传入一个文件字符流 打印到文件中去
        test.print("jjjjjj");
        test.close(); //不关闭流不会写入数据
    }
}
