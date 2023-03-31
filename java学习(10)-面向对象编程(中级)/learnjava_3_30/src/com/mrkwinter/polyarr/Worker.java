package com.mrkwinter.polyarr;

public class Worker extends Person {
    int solery;

    public Worker(String name, int age, int solery) {
        super(name, age);
        this.solery = solery;
    }

    @Override
    public String say() {
        return "工人的信息：" + super.say() + " 工资为: " + solery;
    }
    public String show() {
        return "工人 " + super.getName() + "正在工作";
    }
}
