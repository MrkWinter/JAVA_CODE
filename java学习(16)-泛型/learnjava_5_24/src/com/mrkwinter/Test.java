package com.mrkwinter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, Student> hashmap = new HashMap<>();
        hashmap.put("1",new Student("wang",13));
        hashmap.put("2",new Student("zhang",19));
        hashmap.put("3",new Student("xing",20));
        Set<Map.Entry<String, Student>> entries = hashmap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getValue());
        }
    }
}
class Student {
    private String name;
    int age;

    public Student(String name, int age) {
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