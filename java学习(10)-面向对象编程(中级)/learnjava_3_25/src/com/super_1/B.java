package com.super_1;

public class B extends A {
    int age;
    public B(){
        this(14,"wang");//从子类查找调用构造器 本构造器因为使用了另一个含有super的构造器
        //所以不报错  子类构造器一定要调用父类的构造器
    }
    public B(int age,String name) {
        super(age,name); //直接找父类构造器
        this.age = age; //this.age是子类开始找
        super.age = age; //super.age 是从父类开始找
    }
    public void say() { //super 调用属性相关
        System.out.println(age);//从子类开始找 一直找到object类
        System.out.println(this.age); //同上
        System.out.println(super.age); //直接找父类属性
    }
    public void says() {
        test1(); //直接调用从子类查找
        this.test2();//用this调用同上 在子类中开始查找
        super.test3(); //用super调用 从父类开始查找 调用的是父类
    }
    public void test1() {

    }
    public void test3() {

    }
    //综上
    // 构造器的调用 super this
    // super在子类构造器中必须使用 this在构造器中调用构造器时不能使用super
    //方法和属性调用 直接调用 this super
    //this和直接调用从子类开始查找 然后到父类 直到查找到对应的数据
    //若数据可使用 则调用该数据 若未查到或查到不能使用 则报错
}
