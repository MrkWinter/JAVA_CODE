package com.mrkwinter05;

import java.sql.Date;
import java.time.Instant;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        //Instant类
        //同Date类相似 Instant类通过now方法返回对象 表示当前时间戳
        //Instant对象可通过Date类中的from方法转换成Date对象
        //Date对象也可以根据Date类中的toInstant方法转换成Instant对象
        Instant instant1 = Instant.now();
        System.out.println(instant1);
        java.util.Date date1 = Date.from(instant1);
        System.out.println(date1);
        Instant instant2 = date1.toInstant();
        System.out.println(instant2);



    }
}
