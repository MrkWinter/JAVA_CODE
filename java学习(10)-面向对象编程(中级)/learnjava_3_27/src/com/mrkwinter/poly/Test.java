package com.mrkwinter.poly;

public class Test {
    public static void main(String[] args) {
        //对象多态的简单体现 Dog 和 Cat 是Animal的子类
        //可以把创建的子类对象的引用赋给父类对象的引用
        // ad1是对象animal的引用
        // Animal 是ad1的编译类型    Dog是ad1的运行类型
        //ad1是披着羊皮的狼
        //运行时是运行类型决定
        Animal ad1 = new Dog();
        ad1.cry(); //输出狗叫
        // ad1的运行类型被改成了 Cat 也就是ad1的指向指向了堆区的Cat 运行时看指向的堆区对象
        ad1 = new Cat();
        ad1.cry(); //输出猫叫
    }
}
