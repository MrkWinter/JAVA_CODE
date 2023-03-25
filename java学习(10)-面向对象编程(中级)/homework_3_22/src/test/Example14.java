package test;
abstract class Animal {
    abstract void shout();
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵...");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺...");
    }
}

public class Example14 {
    public static void main(String[] args) {
        Animal an1 = new Cat();
        Animal an2 = new Dog();
        an1.shout();
        an2.shout();
    }
}
