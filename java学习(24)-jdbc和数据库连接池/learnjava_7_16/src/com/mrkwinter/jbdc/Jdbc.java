package com.mrkwinter.jbdc;

import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Jdbc {

    public static void main(String[] args) throws SQLException {
        //前置工作： 在项目下创建一个文件夹比如 libs
        // 将 mysql.jar 拷贝到该目录下，点击 add to project ..加入到项目中
        //1. 注册驱动
        Driver driver = new Driver(); //创建driver对象
        //2. 得到连接
        //(1) jdbc:mysql:// 规定好表示协议，通过 jdbc 的方式连接 mysql
        //(2) localhost 主机，可以是 ip 地址
        //(3) 3306 表示 mysql 监听的端口
        //(4) db03 连接到 mysql dbms 的哪个数据库
        //(5) mysql 的连接本质就是前面学过的 socket 连接
        String url = "jdbc:mysql://localhost:3306/db03"; //规定要连接的mysql主机和数据库
        //将 用户名和密码放入到 Properties 对象
        Properties properties = new Properties();
        properties.setProperty("user", "root"); //规定连接数据库的用户
        properties.setProperty("password", "xing123456");
        //user 和 password 是规定好，后面的值根据实际情况写
        Connection connect = driver.connect(url, properties);
        //3. 执行 sql
        String sql = "insert into table1 values(12,'迪卢克')";
        //String sql = "insert into actor values(null, '刘德华', '男', '1970-11-11', '110')";
        //String sql = "update actor set name='周星驰' where id = 1";
        //statement 用于执行静态 SQL 语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int row = statement.executeUpdate(sql); //row为影响的行数
        System.out.println(row > 0 ? "成功" : "失败");
        //4. 关闭连接资源
        statement.close();
        connect.close();
    }

    @Test
    public void connect1() throws SQLException {
        //注册驱动
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db03";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "xing123456");
        //通过驱动获得连接
        Connection connect = driver.connect(url, properties);
        System.out.println("连接方式一" + connect);
    }

    @Test
    public void connect2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //通过反射注册驱动
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/db03";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "xing123456");
        //通过驱动获得连接
        Connection connect = driver.connect(url, properties);
        System.out.println("连接方式二" + connect);
    }

    @Test
    public void connect3() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        //通过DriverManager 替代 driver 获取连接
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/db03";
        String user = "root";
        String password = "xing123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("连接方式三" + connection);
    }

    @Test
    public void connect4() throws ClassNotFoundException, SQLException {
        //类加载也可以拿掉 因为mysql的jar包中有该driver类的信息 底层自动加载 但不建议
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        //Driver driver = (Driver) aClass.newInstance();
        //DriverManager.registerDriver(driver);
        //通过静态代码块自动注册
        String url = "jdbc:mysql://localhost:3306/db03";
        String user = "root";
        String password = "xing123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("连接方式四" + connection);
    }

    @Test
    @SuppressWarnings("all")
    public void connect5() throws IOException, ClassNotFoundException, SQLException {
        //通过配置文件获取信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("mysql-jdbc.properties"));
        //同方式四一样
        Class<?> driver = Class.forName(properties.getProperty("Driver"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("连接方式五" + connection);
    }
}
