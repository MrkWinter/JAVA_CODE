package com.mrkwinter;

public class Child {
    public static int count = 0; //静态变量单独存放一个空间
    public String name;
    //两种说法
    // 1类变量存放在堆空间 新
    // 2类变量存放在方法区的静态域 旧
    public Child(String name) {
        this.name = name;
    }
    public static void add() {
        Child.count += 1;

    }
    public  void del() {

    }

}
