package com.mrkwinter6;

public class Test {
    public static void main(String[] args) {
        AA a1 = new AA();
        System.out.println("AA类的加载运行时间为：" + a1.getListTime());
        //解释 a1的运行类型为AA 在调用父类方法时 父类方法调用job方法 根据动态绑定机制
        //先从子类中找到 重写后的job方法调用 用父类中的方法实现 这种实现方式称为模板设计模式
        //子类根据抽象父类的一个抽象方法重写 在父类中调用子类重写后的方法实现目的
        BB b1 = new BB();
        System.out.println("BB类的加载运行时间为："+ b1.getListTime());
    }
}
