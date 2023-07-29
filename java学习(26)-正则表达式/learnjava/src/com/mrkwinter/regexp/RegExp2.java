package com.mrkwinter.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class RegExp2 {
    public static void main(String[] args) {
        String str = "dibnoe我佛庵 到那## 129开关阀";
        //String regStr = "[a-z]";//匹配a-z中任意一个字符
        //  String regStr = "[A-Z]"; //匹配A-Z中任意一个字符
        //  String regStr = "abc"; //匹配abc字符串 默认区分大小写
        //  String regStr = "(?i)abc"; //匹配abc中任意一个字符 不区分大小写 可以用括号指定不区分大小写的内容
        //  String regStr = "[0-9]"; //匹配0-9中任意一个字符
        //  String regStr = "[^a-b]"; //匹配不在a-b的中任意一个字符
        //  String regStr = "[^0-9]"; //匹配不在0-9的中任意一个字符
        //  String regStr = "[abc]"; //匹配abc的中任意一个字符
        //  String regStr = "\\d"; //匹配数字中任意一个字符
        //  String regStr = "\\D"; //匹配非数字中任意一个字符
        //  String regStr = "\\w"; //匹配大小写字母 数字 下划线 中任意一个字符
        //  String regStr = "\\W"; //匹配非大小写字母 数字 下划线 中任意一个字符等价于 [^a-zA-z0-9]
        //  String regStr = "\\s"; //匹配任意一个空白字符 空格 制表符等
        //  String regStr = "\\S"; //匹配任意一个非空白字符
        String regStr = "."; //匹配任意一个除\n以外的所有字符 如果需要匹配. 需要用\\.
        Pattern compile = Pattern.compile(regStr);
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
        }
    }
}
