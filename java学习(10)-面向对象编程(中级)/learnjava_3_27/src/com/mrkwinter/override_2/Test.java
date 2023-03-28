package com.mrkwinter.override_2;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("小明", 18);
        System.out.println(p1.showInfo());
        Student s1 = new Student("小刚", 19, 2323123, 100.0);
        System.out.println(s1.showInfo());
    }
}
