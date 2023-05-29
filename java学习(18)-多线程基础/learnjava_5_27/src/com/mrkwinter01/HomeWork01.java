package com.mrkwinter01;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        AA aa = new AA();
        Thread thread = new Thread(aa);
        thread.start();
        BB bb = new BB();
        bb.start();
    }
}
class BB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hihi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class AA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("haha");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}