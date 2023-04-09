package com.mrkwinter.homework_5;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Worker(3000.0).get_year_salary());
        System.out.println(new Teacher(4000,200,10).get_year_salary());
        System.out.println(new Scientist(7000,120000).get_year_salary());
    }
}
