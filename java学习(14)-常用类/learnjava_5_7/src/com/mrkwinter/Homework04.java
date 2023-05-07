package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "wangAAAdiADOR";
        countNum(str);
    }

    public static void countNum(String str) {
        if (str == null) {
            System.out.println("字符串为空");
            return;
        }
        int bCount = 0;
        int sCount = 0;
        int nCount = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) { //可以用charAt()来取得字符串中的字符
                bCount += 1;
            }
            if (Character.isLowerCase(chars[i])) {
                sCount += 1;
            }
            if (Character.isDigit(chars[i])) {
                nCount += 1;
            }
        }
        System.out.println("大写字母有" + bCount + "个");
        System.out.println("小写字母有" + sCount + "个");
        System.out.println("数字有" + nCount + "个");
        //f f t f f t
        //字符拼接时
        String a1 = "ifhsa" + "jefewf";
        //字符串常量相加 是直接在池中开辟空间 存放两个字符串的拼接数据 返回的地址是指向方法区中的常量池中的
        String b1 = "dfsf";
        String a2 = b1 + "dfs";
        //当拼接时有字符串对象 String对象时 会调用方法 创建StringButter类 然后加入字符串
        //最后返回的是字符串对象 数据存储在value数组中
        //常量相加看的是池
        //变量相加看的是堆
    }
}

