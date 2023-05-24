package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        c1.shot();
        Animal d1 = new Dog();
        d1.shot();
    }
}
abstract class Animal {
    abstract public void shot();
}
class Cat extends Animal {
    @Override
    public void shot() {
        System.out.println("喵喵猫？？");
    }
}
class Dog extends Animal {
    @Override
    public void shot() {
        System.out.println("汪汪汪？？？");
    }
}