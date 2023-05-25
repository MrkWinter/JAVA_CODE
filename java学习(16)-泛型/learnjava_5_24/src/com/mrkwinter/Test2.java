package com.mrkwinter;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        HashSet<Student1> hashSet = new HashSet<Student1>();
        hashSet.add(new Student1("wang",13));
        hashSet.add(new Student1("zhang",16));
        hashSet.add(new Student1("xang",17));
        Iterator<Student1> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Student1 next =  iterator.next();
            System.out.println(next);
        }
        for (Student1 o : hashSet) {
            System.out.println(o);
        }

    }
}
class Student1 {
    private String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}