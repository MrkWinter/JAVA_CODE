package com.mrkwinter.polyarr;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) { //构造器
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        return "姓名为：" + name + " 年龄为：" + age;
    }
}
