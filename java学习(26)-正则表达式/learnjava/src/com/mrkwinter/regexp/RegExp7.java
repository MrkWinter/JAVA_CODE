package com.mrkwinter.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class RegExp7 {
    public static void main(String[] args) {
        String str = "你你你好我是是rrrll";
        Pattern compile = Pattern.compile("(.)\\1+");
        Matcher matcher = compile.matcher(str);
        String temp = matcher.replaceAll("$1");
        System.out.println(temp);
        System.out.println(Pattern.compile("(.)\\1+").matcher(str).replaceAll("$1"));
    }
}
