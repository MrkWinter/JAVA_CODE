package com.mrkwinter01;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("mrkwinter");
        sb1.append("12345");

        sb1.delete(1,5); //mnter12345 下标为[1，5)的被删除

        sb1.replace(1,2,"rkwi"); //mrkwiter12345  [1,2)的被替换

        int  index = sb1.indexOf("1");//返回8 找到字符串返回下标位置 找不到返回-1

        sb1.insert(5,"n"); //mrkwinter12345 在下标为5处插入字符串 原下标为5的字符后移
        int length = sb1.length();
        System.out.println(sb1);
        System.out.println(index);
        System.out.println(length);
    }
}
