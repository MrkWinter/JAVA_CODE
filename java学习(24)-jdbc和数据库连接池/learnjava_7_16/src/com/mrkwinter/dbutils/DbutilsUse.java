package com.mrkwinter.dbutils;

import com.mrkwinter.jbdc.Util.JDBCUtil;
import com.mrkwinter.jbdc.Util.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class DbutilsUse {
    public static void main(String[] args) throws SQLException {
        //1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2. 使用 DBUtils 类和接口 , 先引入 DBUtils 相关的 jar , 加入到本 Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 就可以执行相关的方法，返回 ArrayList 结果集
        //String sql = "select * from actor where id >= ?";
        // 注意: sql 语句也可以查询部分列
        String sql = "select id, name from table2 where id >= ?";
        //(1) query 方法就是执行 sql 语句，得到 resultset ---封装到 --> ArrayList 集合中
        //(2) 返回集合
        //(3) connection: 连接
        //(4) sql : 执行的 sql 语句
        //(5) new BeanListHandler<>(Table2.class): 在将 resultset -> Table2 对象 -> 封装到 ArrayList
        // 底层使用反射机制 去获取 Table2 类的属性，然后进行封装
        //(6) 1 就是给 sql 语句中的? 赋值，可以有多个值，因为是可变参数 Object... params
        //(7) 底层得到的 resultset ,会在 query 关闭, 关闭 PreparedStatment
        List<Table2> query = queryRunner.query(connection, sql, new BeanListHandler<>(Table2.class), 1);
        /**
        //分析 queryRunner.query 方法:
        public <T > T query(Connection conn, String sql, ResultSetHandler < T > rsh, Object...params) throws
        SQLException {
            PreparedStatement stmt = null;//定义 PreparedStatement
            ResultSet rs = null;//接收返回的 ResultSet
            Object result = null;//返回 ArrayList
            try {
                stmt = this.prepareStatement(conn, sql);//创建 PreparedStatement
                this.fillStatement(stmt, params);//对 sql 进行 ? 赋值
                rs = this.wrap(stmt.executeQuery());//执行 sql,返回 resultset
                result = rsh.handle(rs);//返回的 resultset --> arrayList[result] [使用到反射，对传入 class 对象处理]
            } catch (SQLException var33) {
                this.rethrow(var33, sql, params);
            } finally {
                try {
                    this.close(rs);//关闭 resultset
                } finally {
                    this.close((Statement) stmt);//关闭 preparedstatement 对象
                }
            }
            return result;
        }*/
        System.out.println(query);
        JDBCUtilsByDruid.close(null,null,connection);
    }

    @Test
    public void testSelect2() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        String sql = "select * from table2 where id = ?";
        QueryRunner queryRunner = new QueryRunner();
        Table2 query = queryRunner.query(connection, sql, new BeanHandler<>(Table2.class), 1);
        System.out.println(query);
        JDBCUtilsByDruid.close(null,null,connection);

    }
    @Test
    public void testSelect3() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        String sql = "select name from table2 where id = ?";
        QueryRunner queryRunner = new QueryRunner();
        //这里不用传入对象 因为返回的是一个object对象
        Object query1 = queryRunner.query(connection, sql, new ScalarHandler<>(), 1);
        System.out.println(query1);
        JDBCUtilsByDruid.close(null,null,connection);
    }
    @Test
    public void testDML() {
        //增 删 改
        Connection connection = JDBCUtilsByDruid.getConnection();
        String sql1 = "insert into table2 values(?,?,?)";
        String sql2 = "delete from table2 where id = ?";
        String sql3 = "update table2 set id = ? where name = ?";
        QueryRunner queryRunner = new QueryRunner();
        try {
            connection.setAutoCommit(false);
            int alteredRow1 = queryRunner.update(connection, sql1, 3, "马化腾", 3000);
            int alteredRow2 = queryRunner.update(connection, sql2, 3);
            int alteredRow3 = queryRunner.update(connection, sql3, 2, "马云");
            connection.commit();
        } catch (SQLException e) {

            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

}
