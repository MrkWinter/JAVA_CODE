package com.mrkwinter.object_4;
//Object 中的finalize方法
//会自动回收垃圾 对象无引用时会自动调用垃圾回收器 超类Object类中的该方法未实现
//留给程序员自主实现 可以连接数据库什么的
public class Finalize {
    public static void main(String[] args) {
        Car b1 = new Car("宝马");
        b1 = null; //并不是一置空就回收 而是有一套自己的算法
        System.gc();//主动调用垃圾回收器显示
        System.out.println("垃圾回收");
    }
}
class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize方法

    @Override
    protected void finalize() throws Throwable {
        super.finalize();//调用父类中方法
        System.out.println("回收垃圾");
    }
}
