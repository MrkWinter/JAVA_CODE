package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        String s1 = "mrk" + "winter";
        //创建了一个对象  底层优化 常量池中直接生成一个 ”mrkwinter“常量
        //s1 指向  “mrkwinter”常量
        String s2 = "mrk";
        String s3 = "winter";
        String s4 = s2 + s3;
        //创建了三个变量 s2 和 s2 是变量名 步骤
        //底层 创建
        StringBuilder sb = new StringBuilder(); //创建该对象 可在该对象中添加字符
        sb.append(s2);  //在原字符串上添加新的内容
        sb.append(s3);  //添加完毕后 继续进行toString类型转换 返回对象
        String s = sb.toString(); //将添加的字符串转换成String类型 生成对象
        //最终返回的是堆区创建的String对象
    }
}
