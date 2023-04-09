package com.mrkwinter.homework_10;

public class Test {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("wang", 23, "工程师", 'M', 1212);
        Doctor d2 = new Doctor("wang", 24, "工程师", 'M', 1212);
        System.out.println(d1.equals(d2));
    }
}
