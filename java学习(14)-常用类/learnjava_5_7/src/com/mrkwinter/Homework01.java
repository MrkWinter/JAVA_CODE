package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        String name = "mrkwinter";

        try {
            name = reverse(name,100,99);
            System.out.println(name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static String reverse(String str,int start,int end) {
        //有时候正确的情况比错误的情况好想
        //进行数据校验时 可以
        //找出正确的情况 然后取反即可
        //这样写思路会很清晰
        if(!(str!=null&&start<end)) {
            throw new RuntimeException("参数不正确");
        }
        if(start<0)
            start = 0;
        if(end>str.length()-1)
            end = str.length()-1;
        //字符串是final的 不能修改 先转换成字符数组
        char[] chars = str.toCharArray(); //先把字符串转换成字符数组
        for(char temp;start<end;start++,end--) {
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
        }
        //String s = chars.toString(); 字符数组转成字符串
        return new String(chars);//新建一个字符串返回
    }
}
