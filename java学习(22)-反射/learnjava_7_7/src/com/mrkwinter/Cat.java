package com.mrkwinter;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Cat {
    public String name = "佩佩";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("hihihi");
    }

    public void cry() {
        System.out.println("喵喵猫");
    }
}
