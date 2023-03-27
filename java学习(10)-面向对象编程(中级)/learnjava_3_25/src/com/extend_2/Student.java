package com.extend_2;

//父类
public class Student {
    public String name;
    public int age;
    private double score;//公有属性

    public Student() { //父类中无参构造器
    }
    public Student(String name,int age) { //父类中有参构造器 在子类继承时要用super关键字来指定
        this.name = name;
        this.age = age;
    }

    //公有方法
    public void setScore(double score) {
        this.score = score;
    }
    //子类可以继承父类的方法和属性
    //私有的方法和属性可通过父类中的公有方法访问
    public void showInfo() {
        System.out.println("学生名 " + name + "age " + age + "score "  + score);
    }
}
