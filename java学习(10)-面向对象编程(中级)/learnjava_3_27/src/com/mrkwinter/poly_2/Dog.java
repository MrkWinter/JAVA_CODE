package com.mrkwinter.poly_2;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void show() {
        //super.show();
        System.out.println("调用子类方法");
    }
    public void show2()
    {
        System.out.println("调用子类方法2");
    }
}
