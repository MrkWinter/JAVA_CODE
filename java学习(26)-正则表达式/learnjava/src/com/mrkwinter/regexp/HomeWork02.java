package com.mrkwinter.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String content = "744988414@qq.com";
        content = "1.23";
        String regStr = "^[\\w_]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
        regStr = "^[-+]?([1-9]\\d*|0)+(\\.?[0-9]+)+$";
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(content);
        System.out.println(matcher.matches());
    }
}
