package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String name = "jack";
        //jack 是字符串常量  name是变量
        char[] name1 = {'m','r','k','w','i','n','t','e','r'};
        byte[] name2 = {'m','r','k','w','i','n','t','e','r'};
        String s1 = new String();
        String s2 = new String("mrkwinter");
        String s3 = new String(name);
        String s4 = new String(name1,1,2);
        String s5 = new String(name2,1,2);

    }
}
