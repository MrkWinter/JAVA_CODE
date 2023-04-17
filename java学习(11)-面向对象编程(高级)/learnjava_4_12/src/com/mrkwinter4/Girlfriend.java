package com.mrkwinter4;

public class Girlfriend {
    private String name;
    private int age;

    private static Girlfriend gf = new Girlfriend("小红",18);//类中创建静态对象
    private Girlfriend(String name, int age) { //将构造器私有化
        this.name = name;
        this.age = age;
    }
    public static Girlfriend getGf() {
        return gf;//公有静态方法返回对象
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
