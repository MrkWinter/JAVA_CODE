package com.mrkwinter;

public interface AInterface {
    public int age = 10;
    //接口中可以定义属性
    void cry(); //抽象方法可以省略abstract
    //接口中可以定义抽象方法
    default public void say() {
        System.out.println("hello");
    }
    //接口中可以定义已实现方法 但前面要加上default

    public static void sad() {
        System.out.println("。。。。");
    }
    //接口中可以定义静态方法
}
