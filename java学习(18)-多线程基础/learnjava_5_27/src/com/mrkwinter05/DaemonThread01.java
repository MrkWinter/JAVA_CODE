package com.mrkwinter05;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class DaemonThread01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Daemon01());
        thread.setDaemon(true); //设置该对象的线程为守护线程
        thread.start();//开启线程前应先设置 是否为守护线程
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程正在工作..." + i);
            Thread.sleep(1000);
        }
        System.out.println("主线程工作完毕...");
    }
}
class Daemon01 implements Runnable {
    private int count = 0;
    @Override
    public void run() {
        while(true) {
            System.out.println("守护线程正在工作..." + count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}