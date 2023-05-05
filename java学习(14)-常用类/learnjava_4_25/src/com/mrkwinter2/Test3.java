package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        String s = "mrkwinter";
        s = s.substring(1,5);  //可以改变指向
        System.out.println(s);

        String s1 = new String("mrkwinter");
        String s2 = new String("mrkwnter");
        s1 = s2 + s2; //创建了一个新的对象 因为value数组为final 不能改变指向
        System.out.println(s1.toString());

    }
}
