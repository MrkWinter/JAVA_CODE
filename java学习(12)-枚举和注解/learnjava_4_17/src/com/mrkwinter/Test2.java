package com.mrkwinter;

import sun.security.krb5.internal.SeqNumber;

/**
 * @author MrkWinter
 * @version 1.0
 */
//使用枚举实现类中的常量
public class Test2 {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());//得到当前枚举常量(对象)的名称
        System.out.println(autumn.ordinal());//得到当前枚举对象的次序 定义枚举常量的次序
        Season2[] values = autumn.values();//返回一个包含所有枚举对象的数组
        for (Season2 season :
                values) {
            System.out.println(season);
        }
        Season2 autumn2 = Season2.valueOf("AUTUMN");
        //valueOf 是Enum类中的一个静态方法 根据输入的字符串 根据对象名去到枚举类中查找到对应的枚举对象
        //然后返回该枚举对象的地址 若输入的对象名有误 则程序报错
    }


    enum Season2 {  //枚举类
        //    public final static Season SPRING = new Season("Spring", "温暖");
        SPRING("Spring", "温暖"),
        //    public final static Season SUMMER = new Season("Summer", "炎热");
        SUMMER("Summer", "炎热"),
        //    public final static Season AUTUMN = new Season("Autumn", "凉爽");
        AUTUMN("Autumn", "凉爽"),
        //    public final static Season WINTER = new Season("Winter", "寒冷");
        WINTER("Winter", "寒冷");

        private String season;
        private String feature;


        private Season2(String season, String feature) {
            this.season = season;
            this.feature = feature;
        }

        public String getSeason() {
            return season;
        }

        public String getFeature() {
            return feature;
        }

        @Override
        public String toString() {
            return "Season{" +
                    "season='" + season + '\'' +
                    ", feature='" + feature + '\'' +
                    '}';
        }
    }
}
