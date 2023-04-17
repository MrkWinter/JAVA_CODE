package com.mrkwinter;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        A a = new A();
        cat.test(a);
        //定义一个接口 在一个类中实现该接口 在其他类中可以接入实现该类的对象
        //就是说 接口就是一个接口 usb 可以接入任何实现该接口的对象
    }
}
