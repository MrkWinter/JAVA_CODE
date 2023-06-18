package com.mrkwinter;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Properties01 {
    //Properties对象的读取配置文件
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();//创建对象
        properties.load(new FileReader("mysql.properties"));//传入结点流
        //将文件信息加载到对象中
        properties.list(System.out);//list 方法接收的是一个打印流
//        这里将 out 标准输出流 PrintStream （为OutputStream子类）传入 转换成PrintWriter类  ***************
//        list方法将 properties对象读取到的配置文件键值对输出到对应的输出位置  *****************
        //这里传入标准输出流 out （屏幕）
        String user = properties.getProperty("user"); //根据键获取值
        String password = properties.getProperty("password");
        System.out.println("user" + user + "password" + password);
    }
}
