package com.mrkwinter3;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String st = String.format("你好%d",23);
        System.out.println(st);
        StringBuffer stringBuffer = new StringBuffer();
        A a = new A();
        a.modify();
    }
}
class A {
    private final char[] arr = {'a'};
    public void modify() {
        arr[0] = 'b'; //内容可修改
        String s = "aaaa";
        //"wsd"是以字符数组的形式存储在value数组中，value数组是String类的一个私有属性，用来保存字符串的内容
        //可以说字符串常量就是String类创建的对象  字符串常量可以使用String类中的所有方法 
    }
}