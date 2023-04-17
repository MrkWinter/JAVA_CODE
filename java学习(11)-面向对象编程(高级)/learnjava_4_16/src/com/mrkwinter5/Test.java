package com.mrkwinter5;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        //就是通过外部类对象名找到内部类 创建对象  内部类是外部类的成员
        Person.People p1 = person.new People();
        p1.show();
        Person.People p2 = person.ret();
        p2.show();

        Person.People p3 = new Person().ret();
        Person.People p4 = new Person().new People();

        Person.People2 p5 = new Person.People2();
        Person.People2 p6 = person.get();
        p5.show();
        p6.show();
    }
}

class Person {
    private String name = "ling";
    private int age;

    public class People {  //成员内部类
        private String name = "wang";

        public void show() {
            System.out.println(Person.this.name);
        }
    }

    ;

    public static class People2 {
        public void show() {
            System.out.println("qing");
        }
    }

    public void show() {
        new People().show();
    }

    public People ret() {
        return new People();
    }

    public static People2 get() {
        return new People2();
    }
}