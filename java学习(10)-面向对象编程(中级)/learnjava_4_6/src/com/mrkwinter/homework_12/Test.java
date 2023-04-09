package com.mrkwinter.homework_12;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("wang", 'M', 23, "1121212");
        Teacher t1 = new Teacher("wang", 'M', 23, 12);
        s1.printf_info();
        t1.printf_info();
    }
}
