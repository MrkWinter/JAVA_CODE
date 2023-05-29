package com.mrkwinter06;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        aa.start();
        bb.start();


    }
}
class AA extends Thread {
    private static boolean label = true;

    public static void setLabel(boolean label) {
        AA.label = label;
    }

    @Override
    public void run() {
        int random;
//        Random random1 = new Random();
        while (label) {
//            random = random1.nextInt(100)+1;
//            System.out.println(random);
            random = (int)(Math.random() * 100 + 1);
            System.out.println(random);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class BB extends Thread {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if(scanner.next().toUpperCase().charAt(0) == 'Q') {
                AA.setLabel(false);
                break;
            }
        }
    }
}