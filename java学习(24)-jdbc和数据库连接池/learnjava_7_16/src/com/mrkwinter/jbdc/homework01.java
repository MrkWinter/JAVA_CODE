package com.mrkwinter.jbdc;

import jdk.nashorn.internal.ir.CallNode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class homework01 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("mysql-jdbc.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("Driver");

        Class<?> aClass = Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        PreparedStatement deleteFromTable1 = connection.prepareStatement("delete from table1");
        int i = deleteFromTable1.executeUpdate();
        System.out.println("删除成功");
        deleteFromTable1.close();

        PreparedStatement preparedStatement = connection.prepareStatement("insert into table1 values(?,?)");
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2, "可莉");
        int i1 = preparedStatement.executeUpdate();
        preparedStatement.close();

        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into table1 values(?,?)");
        preparedStatement1.setInt(1,2);
        preparedStatement1.setString(2, "七七");
        int i2 = preparedStatement1.executeUpdate();
        preparedStatement1.close();

        PreparedStatement preparedStatement2 = connection.prepareStatement("delete from table1 where id = ?");
        preparedStatement2.setInt(1,2);
        int i3 = preparedStatement2.executeUpdate();
        preparedStatement2.close();

        PreparedStatement preparedStatement3 = connection.prepareStatement("select * from table1");
        ResultSet resultSet = preparedStatement3.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + "\t" + name);
        }
        preparedStatement3.close();
        resultSet.close();
        connection.close();
    }
}
