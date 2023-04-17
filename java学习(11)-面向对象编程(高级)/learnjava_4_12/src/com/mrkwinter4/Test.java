package com.mrkwinter4;

public class Test {
    public static void main(String[] args) {
        Girlfriend gf = Girlfriend.getGf(); //饿汉式
        System.out.println(gf);
    }
}
