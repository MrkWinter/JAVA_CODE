package com.mrkwinter.jbdc.Util;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class JDBCUtil<T> {
    static private String url;
    static private String user;
    static private String password;
    static private String driver;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("mysql-jdbc.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        url = properties.getProperty("url");
        user = properties.getProperty("user");
        password = properties.getProperty("password");
        driver = properties.getProperty("Driver");
    }
    //加载得到连接的方法
    public static Connection getCollection() {
        try {
            Class<?> aClass = Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //关闭释放资源的方法
    public static void close(ResultSet resultSet, Statement statement,Connection connection) {
        try {
            if(resultSet!=null)
                resultSet.close();
            if (statement!=null)
                statement.close();
            if (connection!=null)
                connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //结果集的保存
    public void saveResultSet(ResultSet resultSet) {

    }
}
