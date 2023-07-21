package com.mrkwinter.jbdc;

import com.mrkwinter.jbdc.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class JDBCUtilUse {
    public static void main(String[] args) {
        Connection collection = JDBCUtil.getCollection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = collection.prepareStatement("insert into table1 values(?,?)");
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"神里绫华");
            int i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtil.close(null,preparedStatement,collection);
        }

    }
}
