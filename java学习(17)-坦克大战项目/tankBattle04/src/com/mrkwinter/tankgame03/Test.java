package com.mrkwinter.tankgame03;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(EH.A);
        StringBuffer hhhh = new StringBuffer("hhhh");

    }
}

class EH {
    final static int A = 34;
    final static EH a = new EH();
    static {
        System.out.println("he");
    }

}
