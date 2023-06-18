package com.mrkwinter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Properties20 {
    public static void main(String[] args) throws IOException {
        //Properties对象的存储写入和修改
        //存储
        Properties properties = new Properties();
        //创建对象
        properties.setProperty("user", "王五");
        properties.setProperty("id", "1231231");
        properties.setProperty("password", "1231231");
        //写入键值对
        properties.store(new FileWriter("test.properties"),null); //null指注释
        System.out.println("存储成功");
        //修改
        Properties properties1 = new Properties();
        properties1.load(new FileReader("test.properties"));
        properties1.setProperty("user","张三");//修改
        properties1.setProperty("information","wowowowo");
        properties1.list(System.out);//输出
        properties1.store(new FileWriter("test.properties"),"注释");
    }
}
