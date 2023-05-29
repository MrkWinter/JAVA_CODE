package com.mrkwinter06;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        GetMoney g1 = new GetMoney();
        GetMoney g2 = new GetMoney();
        g1.start();
        g2.start();

    }
}

class GetMoney extends Thread {
    private static int sumMoney = 100000;
    private static boolean label = true;

    public static void setLabel(boolean label) {
        GetMoney.label = label;
    }

    public static void get() {
        synchronized (GetMoney.class) {
            if (sumMoney < 1000) {
                System.out.println("钱取光了");
               setLabel(false);
                return;
            }
            sumMoney -= 1000;
            System.out.println("线程" + Thread.currentThread().getName() + "取钱1000" + "剩余" + sumMoney);
        }
    }

    @Override
    public void run() {
        while(label) {
            get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}