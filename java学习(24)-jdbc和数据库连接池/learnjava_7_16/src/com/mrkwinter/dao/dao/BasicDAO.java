package com.mrkwinter.dao.dao;

import com.mrkwinter.dao.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 * 用来简化操作数据的
 */
public class BasicDAO<T> {
    private Connection connection = null;
    private QueryRunner queryRunner = new QueryRunner();

    //dml操作
    public int updateSql(String sql,Object... parameters) {
        connection = JDBCUtilsByDruid.getConnection();
        try {
            return queryRunner.update(connection,sql,parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
    //查 多行多列
    public List<T> quarryMulti(String sql, Class<T> tClass, Object...parameters) {
        connection = JDBCUtilsByDruid.getConnection();
        try {
           return queryRunner.query(connection,sql,new BeanListHandler<>(tClass),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
    //查 单行多列
    public T quarrySingle(String sql,Class<T> tClass,Object... parameters) {
        connection = JDBCUtilsByDruid.getConnection();
        try {
            return queryRunner.query(connection,sql,new BeanHandler<>(tClass),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
    //查 单行单列
    public Object quarryScn(String sql,Object... parameters) {
        connection = JDBCUtilsByDruid.getConnection();
        try {
            return queryRunner.query(connection,sql,new ScalarHandler<>(),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
}
