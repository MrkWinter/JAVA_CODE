package com.xiao;

import com.sun.org.apache.bcel.internal.util.ModularRuntimeImage;
import com.user.Modifier;

public class Test2 {
    public static void main(String[] args) {
        Modifier m1 = new Modifier();//这里是不同包的情况下
        System.out.println(m1.n1 +" "); //在不同包下只能访问public修饰的属性或方法
        //不能访问protected 默认 private 修饰的属性或方法
        //每一个类中都能有一个主方法 但每次运行只能运行一个main方法
    }
}
