package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //jdk5前的手动装箱
        int n = 3;
        Integer integer = new Integer(n);
        Integer integer2 = Integer.valueOf(n);
        //jdk5前的手动拆箱
        int n2 = integer.intValue();
        //jdk5后的自动装箱
        int b = 5;
        Integer integer3 = b; //底层执行的还是  Integer integer3 = Integer.valueOf(b);
        //jdk5后的自动拆箱
        int b2 = integer3;  //底层执行的还是 int b2 = integer3.intValue();
        System.out.println(true?new Integer(1):new Double(2.0));
//        Integer.MIN_VALUE;
//        Integer.MAX_VALUE;
//        Character.isDigit();
//        Character.isLetter();
//        Character.isUpperCase();
//        Character.isLowerCase();
//        Character.isWhitespace();
//        Character.toUpperCase();
//        Character.toLowerCase();
    }
}
