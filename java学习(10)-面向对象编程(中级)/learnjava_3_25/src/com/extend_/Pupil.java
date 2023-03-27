package com.extend_;

//小学生类 的信息大学生也有
public class Pupil {
    public String name;
    public int age;
    private double score;

    public Pupil(String name, int age, double score) {
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
        System.out.println("小学生  " + age + name + score);
    }
}
