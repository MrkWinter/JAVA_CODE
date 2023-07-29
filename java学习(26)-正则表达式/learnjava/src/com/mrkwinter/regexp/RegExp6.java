package com.mrkwinter.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class RegExp6 {
    public static void main(String[] args) {
        //1. 演示 Pattern类 中 matches 方法，用于整体匹配, 在验证输入的字符串是否满足条件使用
        String connect = "hello naofdei ds hello";
        String expStr = "hello";
        boolean matches = Pattern.matches(expStr, connect);
        System.out.println(matches);
        //2. 演示 Matcher类中 matches方法 返回是否整体匹配 该方法在Pattern 类中的 matches 方法中使用
        Pattern compile = Pattern.compile(expStr);
        Matcher matcher = compile.matcher(connect);//得到匹配器对象
        boolean e = matcher.matches();
        System.out.println(e);
        //3 演示 Matcher类中的 start() end() 方法 返回每次匹配的字符串下标的起始和末尾+1
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(connect.substring(start, end));
        }
        //4. 演示 Matcher类中 replaceAll 方法 将匹配字符换成指定字符返回
        String temp = matcher.replaceAll("你好");
        System.out.println(temp);
    }
}
