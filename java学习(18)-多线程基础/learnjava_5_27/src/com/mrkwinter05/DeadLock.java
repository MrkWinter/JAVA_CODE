package com.mrkwinter05;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        //模拟死锁
        AA aa1 = new AA(true);
        AA aa2 = new AA(false);
        aa1.start();
        Thread.sleep(50);
        aa2.start();
    }
}

class AA extends Thread {
    private static Object o1 = new Object(); //静态属性 保证创建不同对象开启线程时
    // 使用的是同一个互斥锁
    private static Object o2 = new Object();
    private boolean loop;

    public AA(boolean a) {
        this.loop = a;
    }

    @Override
    public void run() {
        if (loop) {
            System.out.println("线程进入了true");
            synchronized (o1) {
                System.out.println("ture 拿到了o1对象锁后进入程序");
                try {
                    Thread.sleep(1000); //加入睡眠是如果进入true的线程 执行够快 会在进入false的线程前拿到02锁之前
                    // 先拿到o2锁 程序运行完毕后 还回o2锁 o1锁 并不会影响进入false的线程的执行
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (o2) {
                    System.out.println("true 拿到了02对象锁后进入程序");
                }
            }
        } else {
            System.out.println("线程进入了false");
            synchronized (o2) {
                System.out.println("false 拿到了o2对象锁后进入程序");
                synchronized (o1) {
                    System.out.println("false 拿到了o1对象锁后进入程序");
                }
            }
        }
    }
}
