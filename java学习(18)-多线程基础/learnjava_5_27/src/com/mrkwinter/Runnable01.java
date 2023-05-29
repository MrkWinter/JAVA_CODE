package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Runnable01 {
    public static void main(String[] args) {
        Dog dog = new Dog(); //Dog实现了Runnable接口
        Thread thread = new Thread(dog); //Thread 实现了Runnable接口
        // Thread 可以通过start0来调用dog中的run方法   底层使用了(静态)代理模式解决
        thread.start();
        //1. 继承两步走 new对象  对象调用start
        //2. 实现接口三步走 new对象  new Thread 对象 调用start
    }
}

//模拟Thread 构造器接收 Dog 并且通过start 调用start0 start0 调用Dog的run方法 (静态代理模式)
class Thread02 implements Runnable {
    private Runnable target = null;

    @Override
    public void run() {
        if (target != null) {
            target.run(); //该run方法   根据向上转型机制 调用传入的Dog 的run方法
            //因为是start0调用的 所以开启了线程
        }
    }

    public Thread02(Runnable target) {
        this.target = target; //将Dog传入
    }

    public void start() {
        start0();
    }

    public void start0() {
        run(); //Thread 调用start start调用start0 start0调用 Thread类中的run方法
    }
}

//通过实现Runnable接口来开发线程类
class Dog implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        int count = 0;
        while (true) {
            System.out.println("hihihi");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count > 20)
                break;
        }
    }
}