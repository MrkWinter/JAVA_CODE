package com.mrkwinter4;

public class Test {
    public static void main(String[] args) {
//直接使用匿名内部类作为参数
        printf(new IB() {
            @Override
            public void show() {
                System.out.println("用匿名内部类直接作为参数");
            }
        });
        //这里本质上也是创建了一个类IB$1 实现了该接口 重写了该方法 然后返回一个该类的对象
        //调用传入调用方法时动态绑定该对象的重写的方法 实现多态
    }

    public static void printf(IB ib) { //用接口接收 实现多态 一般情况要先实现接口类 类比用父类接收要创建子类
        ib.show();// 动态绑定直接调用传入对象的show()
    }
}

interface IB {
    void show();
}