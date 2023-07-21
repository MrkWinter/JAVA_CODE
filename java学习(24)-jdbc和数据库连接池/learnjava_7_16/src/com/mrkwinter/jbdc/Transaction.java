package com.mrkwinter.jbdc;

import com.mrkwinter.jbdc.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Transaction {
    public static void main(String[] args) throws SQLException {
        Connection collection = JDBCUtil.getCollection();
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        try {
            collection.setAutoCommit(false); //开启事物
             preparedStatement = collection.prepareStatement
                    ("update table2 set ballance = ballance + 100 where name = '马云'");
            preparedStatement.executeUpdate();
            int i = 1/0;//出现异常事物回滚
            preparedStatement1 = collection.prepareStatement
                    ("update table2 set ballance = ballance - 100 where name = '马超'");
            preparedStatement1.executeUpdate();
            collection.commit();//全部完成 提交
        } catch (SQLException e) {
            collection.rollback(); //事物回滚
            throw new RuntimeException(e);
        } finally {
            JDBCUtil.close(null,preparedStatement,null);
            JDBCUtil.close(null,preparedStatement1,collection);
        }
    }
}
