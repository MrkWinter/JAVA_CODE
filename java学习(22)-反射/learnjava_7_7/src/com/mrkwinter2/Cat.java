package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Cat {
    public int age = 10;
    public String name = "佩佩";
    public String color = "咖啡色";

    public Cat() {
    }

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void cry() {
        System.out.println("喵喵猫");
    }
}
