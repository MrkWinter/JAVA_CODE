package com.mrkwinter.jbdc;

import com.mrkwinter.jbdc.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Batch {
    public static void main(String[] args) throws Exception {
        Connection collection = JDBCUtil.getCollection();
        String url = "insert into table3 values(?,?)";
        PreparedStatement preparedStatement = collection.prepareStatement(url);
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, "jack" + i);
            preparedStatement.addBatch();
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            //将 sql 语句加入到批处理包中 -> 看源码
            //1. //第一就创建 ArrayList - elementData => Object[]
            //2. elementData => Object[] 就会存放我们预处理的 sql 语句
            //3. 当 elementData 满后,就按照 1.5 扩容
            //4. 当添加到指定的值后，就 executeBatch()
            //5. 批量处理会减少我们发送 sql 语句的网络开销，而且减少编译次数，因此效率提高
            //public void addBatch () throws SQLException {
            //    synchronized (this.checkClosed().getConnectionMutex()) {
            //        if (this.batchedArgs == null) {
            //            this.batchedArgs = new ArrayList();
            //        }
            //        for (int i = 0; i < this.parameterValues.length; ++i) {
            //            this.checkAllParametersSet(this.parameterValues[i], this.parameterStreams[i], i);
            //        }
            //        this.batchedArgs.add(new PreparedStatement.BatchParams(this.parameterValues,
            //                this.parameterStreams, this.isStream, this.streamLengths, this.isNull));
            //    }
            //}
            }
        }
        JDBCUtil.close(null, preparedStatement, collection);
    }
}
