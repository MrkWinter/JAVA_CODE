package com.mrkwinter04;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class YieldAndJoin {
    public static void main(String[] args) throws InterruptedException{
        T t = new T();
        t.start();
        for (int i = 0; i <20; i++) {
            if(i == 10)
//                t.join();//插入子线程 让子线程先运行 运行完毕后再运行主线程
                Thread.yield(); //礼让子线程
            System.out.println("主线程正在运行" + i);
            Thread.sleep(1000);
        }
    }
}
class T extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程正在进行" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
