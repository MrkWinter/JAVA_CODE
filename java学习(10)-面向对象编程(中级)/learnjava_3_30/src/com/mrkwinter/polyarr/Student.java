package com.mrkwinter.polyarr;

public class Student extends Person {
    int score;

    public Student(String name, int age, int score) { //继承父类构造器
        super(name, age);
        this.score = score;
    }

    @Override
    public String say() { //从写父类方法 向上转型时调用方法看子类
        return "学生信息为：" +  super.say() + " 分数为：" + score;
    }
    public String show() {
        return "学生 " + super.getName() + "正在学习";
    }
}
