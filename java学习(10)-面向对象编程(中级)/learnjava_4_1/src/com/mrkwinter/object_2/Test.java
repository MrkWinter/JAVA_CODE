package com.mrkwinter.object_2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("liming", 23, 'M');
        Person person2 = new Person("liming", 23, 'M');
        System.out.println(person.equals(person2));
    }
}
