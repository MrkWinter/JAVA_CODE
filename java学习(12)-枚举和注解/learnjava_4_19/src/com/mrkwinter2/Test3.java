package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Cellphone c1 = new Cellphone();
        System.out.println(c1.testWork(new calculator() {
            @Override
            public double work(double a, double b) {
                return a * b;
            }
        }, 10, 20));
    }
}

interface calculator {
    public double work(double a, double b);
}//匿名内部类可以当做对象使用

class Cellphone {

    public double testWork(calculator c1, double a, double b) {

        System.out.println("调用接口中test方法");
        return c1.work(a, b);
    }
}
