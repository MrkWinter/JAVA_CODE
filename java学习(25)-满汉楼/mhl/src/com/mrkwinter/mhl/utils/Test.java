package com.mrkwinter.mhl.utils;

import java.sql.Connection;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        int i = Utility.readInt();
        System.out.println(i);

        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection + "连接成功");
        JDBCUtilsByDruid.close(null,null,connection);
    }
}
