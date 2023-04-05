package com.mrkwinter.object_1;

public class Equals {
    public static void main(String[] args) {
        System.out.println("liming".equals("wang"));//false
        Integer integer1 = new Integer(5);
        Integer integer2 = new Integer(5);
        System.out.println(integer1 == integer2);//false ==对引用类型判断地址
        System.out.println(integer1.equals(integer2));//true 判断值相等
    }
}
