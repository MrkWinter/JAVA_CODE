package com.mrkwinter5;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class PrintStream01 {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out; //这里静态属性 默认PrintStream字节打印流 中 的打印位置为屏幕
        out.println("hello"); //底层使用是write方法 打印到屏幕
        out.write("hi ha".getBytes()); //直接使用write方法传入字节数组 打印到屏幕
        System.setOut(new PrintStream("test.txt"));//
        //也可以调用System类中的静态方法setOut 重新设置静态属性PrintStream字节打印流
        // 从而设置其的打印位置
        System.out.println("你好呀");
        out.close();
        //上面代码本质上和下面一样 也是创建对象后调用 只不过是通过方法创建一个新的对象赋给System类中的out
        //再对该对象进行使用 (方法调用)
        PrintStream printStream = new PrintStream("test.txt"); //创建对象时可以指定输输出的位置 可以是文件 屏幕等
        printStream.println("你好啊");
        printStream.close();
    }
}
