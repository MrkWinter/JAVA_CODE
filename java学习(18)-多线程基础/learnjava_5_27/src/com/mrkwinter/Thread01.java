package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
//1. 当一个类继承了Thread 类 该类就可以当做线程使用
//2. 我们会重写 run方法 写上自己的业务代码
//3. run 是Thread类 实现了  Runnable (接口) 中 的run方法
//public void run() {
//    if (target != null) {
//        target.run();
//    }
//}
//4. 多线程中 进程开启 运行主线程 主线程可以再开启其他线程同时主线程继续执行  mian线程挂掉后 其他线程不一定结束
//直到所有线程结束后 进程才会结束

public class Thread01  {
    public static void main(String[] args) throws InterruptedException{
        System.out.println(Thread.currentThread().getName());//线程名 main
        //创建一个Cat对象可当做线程使用
        Cat cat = new Cat();
        cat.start();//调用start方法 是为了启动线程 直接调用run算是在main线程中执行 并且在此阻塞
        //start0();方法 jvm底层方法 实现多线程 start0()中开线程 调用run方法
        for (int j = 0; j < 10; j++) {
            Thread.sleep(1000);
            System.out.println("jajaja");
        }
    }
}
class Cat extends Thread {
    @Override //run方法是
    public void run() {
        int i = 0;
        System.out.println(Thread.currentThread().getName());//线程名Thread-0
        while (i<8) {
            System.out.println("我是神里绫华的狗！！");
            try {
                Thread.sleep(1000); //Thread类中的静态方法 sleep 休眠一秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class Dog2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            System.out.println("jajaja");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}