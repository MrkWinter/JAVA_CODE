package com.mrkwinter.homework_4;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("tom",
                200, 20, 1.2, 10000.0);
        CommonStaff c1 = new CommonStaff("mina",
                120, 42, 1.0);
        System.out.println(m1.ret_salary());
        System.out.println(c1.ret_salary());
    }
}
