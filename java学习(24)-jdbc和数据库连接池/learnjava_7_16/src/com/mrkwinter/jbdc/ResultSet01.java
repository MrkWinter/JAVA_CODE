package com.mrkwinter.jbdc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class ResultSet01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("mysql-jdbc.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("Driver");
        String sql = "select * from table1";
        //1.注册驱动
        Class<?> aClass = Class.forName(driver);
        //2.获取连接通道
        Connection connection = DriverManager.getConnection(url,user,password);
        //3.获取指令通道
        Statement statement = connection.createStatement();
        //4.组建发送指令
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");//通过列名指定 推荐
            int anInt = resultSet.getInt(1);//获取该行的第一列
            String string = resultSet.getString(2);//得到该行的第二列
            System.out.println("\t" + anInt+ "\t" + string);
        }
        //关闭通道
        resultSet.close();
        statement.close();
        connection.close();
    }
}
