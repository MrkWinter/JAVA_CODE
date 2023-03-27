package com.extend_;

public class Graduate { //大学生的属性
    public String name;
    public int age;
    private double score;

    public Graduate(String name, int age, double score) {
        setAge(age);
        setName(name);
        setScore(score);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo() {
        System.out.println("大学生  " + age + name + score);
    }
}
