package com.mrkwinter;

public class Test {
    public static void main(String[] args) {
        Child c = new Child("wang");
        Child.count = 3;//类变量是随着类的加载创建的，所以没有实例化对象也可以访问
        System.out.println(Child.count);

        c.add();
        //Child.add();
        System.out.println(Child.count);
        //类变量只能用类名访问 类方法可以用对象名访问 也可以用类名访问
        //静态方法和非静态方法都可以使用类变量
    }
}
