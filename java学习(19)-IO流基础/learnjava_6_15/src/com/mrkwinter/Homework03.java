package com.mrkwinter;

import java.io.*;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("dog.properties"));//加载信息
        String name = properties.getProperty("name");
        int age = new Integer(properties.getProperty("age"));
        String color = properties.getProperty("color");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        //序列化
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("dog.dat"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
        //反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("dog.dat"));
        Object o = objectInputStream.readObject(); //类型转换异常
        if(o instanceof Dog) {
            Dog o1 = (Dog) o;
            System.out.println(o1);
        }
        objectInputStream.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}