package com.mrkwinter.jbdc.Util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class JDBCUtilsByDruid {
    private static DataSource dataSource;
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
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
}
