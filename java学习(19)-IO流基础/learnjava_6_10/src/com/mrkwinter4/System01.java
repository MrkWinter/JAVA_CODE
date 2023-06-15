package com.mrkwinter4;

import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class System01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //这里的System.in 是指一个输入流 是将输入流传入Scanner对象 注意 in是输入流对象
        //是System类中的一个静态属性 其编译类型为InputSteam 运行类型是BufferedInputStream
        String next = scanner.next();
        System.out.println("你好");
        //System.out 是一个输出流 这里是将"你好"通过输出流中的printf方法输出到屏幕上 注意 out是
        //输出流对象 是System类中的一个静态属性 其编译类型和运行类型都是PrintStream
    }
}
