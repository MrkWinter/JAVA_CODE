package com.mrkwinter.jbdc;

import com.mrkwinter.jbdc.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reback1 {
    public static void main(String[] args) throws SQLException {
        Connection collection = JDBCUtil.getCollection();
        collection.setAutoCommit(false);
        PreparedStatement preparedStatement = collection.prepareStatement("insert into table1 values(1,'j')");
        preparedStatement.executeUpdate();
        preparedStatement.addBatch();
        preparedStatement.executeQuery();
        preparedStatement.clearBatch();
    }
}
