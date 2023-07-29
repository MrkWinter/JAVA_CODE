package com.mrkwinter.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class RegExp5 {
    public static void main(String[] args) {
        String content = "hanshunping s7789 nn1189han";
        //下面就是非命名分组
        // 1. matcher.group(0) 得到匹配到的字符串
        // 2. matcher.group(1) 得到匹配到的字符串的第 1 个分组内容
        // 3. matcher.group(2) 得到匹配到的字符串的第 2 个分组内容
        //String regStr = "(\\d\\d)(\\d\\d)";//匹配 4 个数字的字符串
        //命名分组： 即可以给分组取名
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";//匹配 4 个数字的字符串
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
            System.out.println("第 1 个分组内容=" + matcher.group(1));
            System.out.println("第 1 个分组内容[通过组名]=" + matcher.group("g1"));
            System.out.println("第 2 个分组内容=" + matcher.group(2));
            System.out.println("第 2 个分组内容[通过组名]=" + matcher.group("g2"));
        }
        //捕获分组：
        String content1 = "hello 韩顺平教育 jack 韩顺平老师 韩顺平同学 hello 韩顺平学生";
        // 找到 韩顺平教育 、韩顺平老师、韩顺平同学 子字符串
        //String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";
        //上面的写法可以等价非捕获分组, 注意：不能 matcher.group(1)
        //String regStr = "韩顺平(?:教育|老师|同学)";
        //找到 韩顺平 这个关键字,但是要求只是查找韩顺平教育和 韩顺平老师 中包含有的韩顺平
        //下面也是非捕获分组，不能使用 matcher.group(1)
        //String regStr = "韩顺平(?=教育|老师)";
        //找到 韩顺平 这个关键字,但是要求只是查找 不是 (韩顺平教育 和 韩顺平老师) 中包含有的韩顺平
        //下面也是非捕获分组，不能使用 matcher.group(1)
        String regStr1 = "韩顺平(?!教育|老师)";
        Pattern pattern1 = Pattern.compile(regStr1);
        Matcher matcher1 = pattern1.matcher(content1);
        while (matcher1.find()) {
            System.out.println("找到: " + matcher1.group(0));
        }
    }
}
