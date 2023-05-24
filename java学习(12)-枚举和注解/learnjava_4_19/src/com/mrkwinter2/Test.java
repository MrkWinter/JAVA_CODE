package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("第一次打印的序号是" + Frock.getNextNum());
        System.out.println("第二次打印的序号是" + Frock.getNextNum());
        Frock f1 = new Frock();
        System.out.println("第一个对象的序列号为" + f1.getSerialNumber());
        Frock f2 = new Frock();
        System.out.println("第二个对象的序列号为" + f2.getSerialNumber());
    }

}
class Frock {
    private static int currentNum = 100000;
    private int serialNumber;
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        this.serialNumber = Frock.getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}