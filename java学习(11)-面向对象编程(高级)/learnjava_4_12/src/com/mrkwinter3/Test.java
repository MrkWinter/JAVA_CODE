package com.mrkwinter3;

public class Test {
    public static void main(String[] args) {
        new AA();
    }
}

//class AA {
//    public AA() {
//        super();//继承object类
//        //调用普通代码块
//        //构造器属性初始化
//    }
//}

class BB {
    {
        System.out.println("BB的普通代码块");
    }
    public BB() {
        super();//继承object
        //调用代码块
        System.out.println("BB的构造器内容");
    }
}
class AA extends BB{
    {
        System.out.println("AA的普代码块");
    }
    public AA() {
        super(); //调用BB类的构造器
        //调用普通代码块
        System.out.println("AA的构造器内容");
    }
}

/*
总结 继承关系下创建一个子类对象发生的过程
分为两个阶段 类加载阶段和对象创建阶段

类加载阶段 遵循先加载父类然后再加载子类的原则

按定义顺序先调用父类的静态属性和静态代码块
然后按定义顺序调用子类的静态属性和静态代码块

对象创建阶段  先前学习的对象的继承

先调用子类的构造器 找到super() 调用父类的构造器
父类的super()无参构造器执行完毕后 开始构造器中隐藏的调用方法
调用父类的普通属性 和普通代码块 完成后执行父类的构造器
父类构造器执行完毕后 返回子类的构造器等于子类的super()执行完成
接着执行子类构造器中隐藏的调用方法
调用子类的普通属性和普通代码块
完成后执行子类的构造器
返回对象引用
至此对象创建完毕
 */

//静态成员sam初始化
//static块执行
//sam1 成员初始化
//Test默认构造器被调用