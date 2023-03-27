package com.super_1;

public class B extends A {
    int age;
    public B(){
        this(14,"wang");//从子类查找调用构造器 本构造器因为使用了另一个含有super的构造器
        //所以不报错  子类构造器一定要调用父类的构造器
    }
    public B(int age,String name) {
        super(age,name); //直接找父类构造器
        this.age = age; //this.age是子类开始找
        super.age = age; //super.age 是从父类开始找
    }
    public void say() { //super 调用属性相关
        System.out.println(age);//从子类开始找 一直找到object类
        System.out.println(this.age); //同上
        System.out.println(super.age); //直接找父类属性
    }
}
