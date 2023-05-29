package com.mrkwinter05;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Synchronized01 {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();//同一个对象 开启三个线程 使用接口开启线程可以使多个线程共享一个资源
        new Thread(sellTicket).start();//未开启线程同步 会存在同时进入if语句 让票售为负数的情况
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
    }
}

class SellTicket implements Runnable {
    private int ticketCount = 100;
    private boolean loop = true;

    public /*synchronized*/ void sell() { //synchronized 修饰方法可以使线程同步 避免多个线程同时进入 这时锁在this对象
        synchronized (this) {  //synchronized 修饰代码块 ()里的对象是互斥锁的存放位置 每个对象都有一个锁
            // 拿到该锁的可以进行synchronize下定义的代码 (this) 中this可以替换成其他对象
            if (ticketCount > 0)
                System.out.println(Thread.currentThread().getName() + "窗口正在售票 剩余" + ticketCount-- + "张");
            else {
                System.out.println("售票结束");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();// 一个线程结束后 另一个线程再进入 防止多个线程同时进入
        }
    }
}