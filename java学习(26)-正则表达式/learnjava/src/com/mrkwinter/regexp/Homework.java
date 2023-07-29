package com.mrkwinter.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework {
    public static void main(String[] args) {

        String con = "你好";
        //1.验证是否为汉字
//        String regStr = "^\\W+$";
        //2.邮政编码 1-9开头的一个六位数
//        String regStr = "^[1-9]\\d{5}$";
        //3. qq号码 以1-9开头的一个5-10位数字
//        String regStr = "^[1-9]\\d{4,9}$";
        //4. 手机号码 以13 14 15 18 开头的11位数字
//        String regStr = "^1(?:3|4|5|8)[0-9]{9}$";
        //5. URL 如图
        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";
        //注意：[. ? *]中符号表示就指符号本身 并不是有特殊含义
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(con);
        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
        }
    }
}
