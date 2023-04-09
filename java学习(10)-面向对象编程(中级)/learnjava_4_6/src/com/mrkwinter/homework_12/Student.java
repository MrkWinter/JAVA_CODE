package com.mrkwinter.homework_12;

public class Student extends Person { //继承时可能会继承包外的类

    private String id;

    public Student(String name, char sex, int age, String id) {
        super(name, sex, age);
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void study() {
        System.out.println("我承诺，我会好好学习");
    }
    public String play() { //方法重写 实现代码复用
        return super.play() + "足球";
    }
    public void printf_info() {
        System.out.println("学生的信息：");
        System.out.println(super.base_printf()); //打印基本信息
        System.out.println("学号：" + id);
        study(); //调用子类方法
        System.out.println(play()); //调用子类方法 该方法重写父类方法已经实现复用
        //再次复用 打印爱好
    }
}
