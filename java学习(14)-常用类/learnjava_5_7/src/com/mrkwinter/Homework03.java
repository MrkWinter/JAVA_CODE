package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "Willian Jefferson Clinton";
        System.out.println(transfer(name));
        printName(name);
    }

    public static String transfer(String name) {
        char[] names = name.toCharArray();
        int first = name.indexOf(" ");
        int second = name.indexOf(" ", first + 1);
        StringBuilder stb = new StringBuilder();
        for (int i = second + 1; i < names.length; i++) {
            stb.append(names[i]);
        }
        stb.append(',');
        for (int i = 0; i < first; i++) {
            stb.append(names[i]);
        }
        stb.append('.');
        stb.append(Character.toUpperCase(names[first + 1]));
        return new String(stb);
    }
    public static void printName(String name) {
        if(name == null) {
            System.out.println("字符串为空");
            return;
        }
        String[] names = name.split(" ");//按字符空格分割 返回字符串数组
        if(names.length != 3) {
            System.out.println("名字格式不正确");
            return;
        }
        String resultName = String.format("%s,%s.%s",
                names[2],names[0],names[1].toUpperCase().charAt(0));
        //String类中的toUpperCase()方法将字符串转换成大写字符并返回字符串
        //charAt方法取得字符串中的第一个字符
        System.out.println(resultName);
    }
}
