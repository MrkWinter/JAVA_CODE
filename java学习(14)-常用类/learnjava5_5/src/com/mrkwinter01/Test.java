package com.mrkwinter01;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(String.format("今天是%.3f号", 4.2));
        //等价于c语言中的printf函数 %.3
        StringBuffer stringBuffer = new StringBuffer();
        //创建一个大小为16的char[] 用于存放字符
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //创建一个大小为100的char[] 用于存放字符
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        //创建第一个大小为Str.length + 16 (21) 的char[] 数组 用于存放"hello" 和后续可添加的其他字符

        //StringBuffer 转换成 String
        StringBuffer sb1 = new StringBuffer("hello tom");
        //方式一 使用StringBuffer中的toString方法转换成String
        String s1 = sb1.toString();
        //方式二 使用String类中的构造器直接创建String类对象
        String s2 = new String(sb1);


        //String 转换成 StringBuffer
        String s3 = new String("hello mike");
        //方式一 直接使用StringBuffer中的构造器
        StringBuffer sb2 = new StringBuffer(s3);
        //方式二 先创建一个新的StringBuffer容器 再用其中的append方法将字符串添加进去
        StringBuffer sb3 = new StringBuffer();
        sb3 = sb3.append(s3);
        //tip：append方法是将字符串添加到原StringBuffer的字符数组中 然后返回原StringBuffer对象
    }
}
