package com.mrkwinter.jbdc;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class PrepareStatement01 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        //next()方法得到的字符串按空格隔开 不能读取空格 而是读到空格自动结束
        //nextline() 方法可以读空格
        System.out.println("请输入查询id");
        String id = scanner.nextLine();
        System.out.println("请输入查询姓名");
        String name = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("mysql-jdbc.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("Driver");

        Class<?> aClass = Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        //用PreparedStatemet代替statement
        //statement是直接用方法发送sql指令
        //不同于statement prest 需要指定sql语句 然后进行预处理
        //再调用方法 自动将处理后的sql语句发送
        PreparedStatement preparedStatement = connection.prepareStatement(
                "select * from table1 where id = ? and name = ?");
        preparedStatement.setString(1,id);
        preparedStatement.setString(2,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        //注意： 执行select语句用executeQuery() 执行cud语句用excuteUpdate()
        if(resultSet.next()) {
            System.out.println("查询成功");
            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t");
        } else {
            System.out.println("查询失败");
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
