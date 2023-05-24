package com.mrkwinter.homework_12;

public class Teacher extends Person {
    private int work_age;
    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teacher() {
        System.out.println(getName() + "承诺，我会好好教课");
    }
    public String play() { //方法重写 实现代码复用
        return super.play() + "象棋";
    }
    public void printf_info() {
        System.out.println("老师的信息：");
        System.out.println(super.base_printf()); //打印基本信息
        System.out.println("工龄：" + work_age);
        teacher(); //调用子类方法
        System.out.println(play()); //调用子类方法 该方法重写父类方法已经实现复用
        //再次复用 打印爱好
    }

    @Override
    public String toString() {
        return super.toString() + " work_age " + work_age;
    }
}
