package com.mrkwinter4;

public class Cat {
    private String name;
    private static Cat cat; //静态创建对象引用 不初始化对象

    private Cat(String name) { //将构造器私有化
        this.name = name;
    }
    public static Cat getCat() { //通过公共方法返回对象
        if(cat == null) { //保证只创建一次
            cat = new Cat("布丁");
        }
        return cat;
    }
}
