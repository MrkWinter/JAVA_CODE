package com.mrkwinter05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        //第三代日期类
        //LocalDateTime类(年月日 时分秒) LocalDate类(年月日) LocalTime类(时分秒)
        //用对应类中的now方法来获取当前系统时间(年月日 时分秒)
        LocalDate lt1 = LocalDate.now(); //年月日
        LocalTime lt2 = LocalTime.now(); //时分秒
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt); // 2023-05-06T20:42:56.891
        //用类中方法得到对象对应的数据(年月日 时分秒)
        System.out.println("年" + lt.getYear());
        System.out.println("月" + lt.getMonth());
        System.out.println("月" + lt.getMonthValue());
        System.out.println("日" + lt.getDayOfMonth());
        System.out.println("时" + lt.getHour());
        System.out.println("分" + lt.getMinute());
        System.out.println("秒" + lt.getSecond());

        //DateTimeFormatter类
        //可以通过该类中的ofPattern方法创建对象 该对象中的format方法可以根据创建对象时指定的格式来格式化第三代日期类
        //并返回格式化后的字符串
        DateTimeFormatter std = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分ss秒\n");
        String format = std.format(lt);
        System.out.println(format);

        //第三代日期类中提供了大量的plus minus 方法可以对当前的时间进行加减
        LocalDateTime lt3 = lt.plusDays(890);
        System.out.println("890天后为 " + std.format(lt3));
        System.out.println("38383小时前时间为 " + std.format(lt.minusHours(38383)));
    }
}
