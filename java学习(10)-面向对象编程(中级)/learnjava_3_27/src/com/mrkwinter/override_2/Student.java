package com.mrkwinter.override_2;

public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) { //super调用构造器
        super(name, age); //继承父类属性调用父类构造器 初始化父类属性成为子类属性
        this.id = id;
        this.score = score;
    }
    public String showInfo() { //super调用方法
        return super.showInfo()+ " 学号：" + id + " 分数：" + score;
        //用super关键字调用父类方法实现子类方法重写的内容 提高代码复用性
    }
}
