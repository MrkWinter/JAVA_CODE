package com.mrkwinter05;

import java.sql.SQLOutput;
import java.util.Calendar;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {

    public static void main(String[] args) {
        //1. Calendar是一个抽象类 并且构造器是protected的
        //2. 可以通过getInstance() 来获取实例 (当前系统时间)
        //3. 提供大量的方法和字段提供给程序员
        //4. Calendar类没有格式化的辅助类 需要程序员按照自己的需求输出
        //5. 如果想要使用24小时制日期 使用 HOUR_OF_DAY 即可
        Calendar c1 = Calendar.getInstance();
        System.out.println("Calendar类对象的字段格式" + c1);
        //[time=1683374686535,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
        //zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,
        //useDaylight=false,transitions=31,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
        //ERA=1,YEAR=2023,MONTH=4,WEEK_OF_YEAR=18,WEEK_OF_MONTH=1,DAY_OF_MONTH=6,DAY_OF_YEAR=126,
        //DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=4,SECOND=46,
        //MILLISECOND=535,ZONE_OFFSET=28800000,DST_OFFSET=0]
        System.out.println("年" + c1.get(Calendar.YEAR));
        System.out.println("月" + (c1.get(Calendar.MONTH) + 1));
        System.out.println("日" + c1.get(Calendar.DAY_OF_MONTH));
        System.out.println("时" + c1.get(Calendar.HOUR_OF_DAY));
        System.out.println("分" + c1.get(Calendar.MINUTE));
        System.out.println("秒" + c1.get(Calendar.SECOND));

    }
}
