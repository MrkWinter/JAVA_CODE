package com.mrkwinter02;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1.abs 绝对值
        double a = -3.2;
        System.out.println(Math.abs(a));
        //2.pow 平方
        double a2 = 3;
        System.out.println(Math.pow(a2,4));
        //3.ceil 向上取整
        double a3 = -3.2;
        System.out.println(Math.ceil(a3));
        //4.floor 向下取整
        float a4 = -4.2f;
        System.out.println(Math.floor(a4));
        //5.round 四舍五入 +0.5转成long
        double a5 = -5.6;
        System.out.println(Math.round(a5));
        //6.sqrt 求平方
        int a6 = 9;
        System.out.println(Math.sqrt(9));
        //7.random 求任意随机数范围 random返回0~1的随机小数
        int a7 = (int)(Math.random() * 11);
        System.out.println(a7);
        //tip： 若想取a 到 b 的int随机数
        //可以使用 (int)a <  范围  < (int)(a + Math.random() * (b - a + 1) )
        //8.max 和 min 求两个数字中最大和最小值
        int a8 = Math.max(12,45);
        int a9 = Math.min(42,11);
        System.out.println(a8 + " " + a9);
    }
}
