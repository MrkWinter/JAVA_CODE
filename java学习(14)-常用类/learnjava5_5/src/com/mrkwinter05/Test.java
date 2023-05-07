package com.mrkwinter05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        //用Date类获取当前系统时间
        Date date = new Date();
        System.out.println(date);
        //用Date构造器得到距1970-1-1日对应毫秒的date
        Date date1 = new Date(192290202);
        System.out.println(date1);

        //用SimpleDateFormat类创建对象 指定输出对应的日期格式
        //该对象中的format方法可以将date对象转换成对应日期格式的字符串
        //日期格式是规定好的 不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String stDate = sdf.format(date);
        System.out.println(stDate);

        //SimpleDateFormat对象可以将格式化的字符串再转换成date对象 但需要抛出转换异常 throws ParseException
        //转换成的date对象输出时还是原形式 需要格式的还需再进行转换
        //格式化的字符串若与SimpleDateFormat对象指定的格式不一样 会抛出异常
        Date date2 = sdf.parse("2022年05月07日 02:25:53 星期二");
        //这里日期 星期 不对？？？
        System.out.println(sdf.format(date2));
    }
}
