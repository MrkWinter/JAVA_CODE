package com.mrkwinter.homework_1;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    //冒泡排序Person类数组
    public void inorder(Person[] parry) {
        for (int i = 0; i < parry.length - 1; i++) {
            for (int j = 0; j < parry.length - i - 1; j++) {
                if (parry[i].age > parry[i + 1].age) {
                    Person temp = parry[i];
                    parry[i] = parry[i + 1];
                    parry[i + 1] = temp;
                }
            }
        }
    }
}