package com.mrkwinter.DateSources;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.beans.Transient;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class C3p0 {
    @Test
    public void connect1() throws PropertyVetoException, SQLException {
        //创建一个数据源对象 用数据去初始化 (连接交给该对象)
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        String url = "jdbc:mysql://localhost:3306/db03";
        String user = "root";
        String password = "xing123456";
        String driver = "com.mysql.jdbc.Driver";
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setDriverClass(driver);
        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxConnectionAge(50);
        //得到池中的连接
        Connection connection = comboPooledDataSource.getConnection();
        System.out.println(connection + "连接成功");
        //断开在池中的引用
        connection.close();
    }
    @Test
    public void connect2() throws SQLException {
        //使用配置文件初始化数据源对象
        ComboPooledDataSource c3p0 = new ComboPooledDataSource("test_c3p0");
        Connection connection = c3p0.getConnection();
        System.out.println(connection + "连接成功");
        connection.close();
    }

}
