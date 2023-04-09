package com.mrkwinter.homework_3;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double garde;

    public double getGarde() {
        return garde;
    }

    public void setGarde(double garde) {
        this.garde = garde;
    }

    public Teacher(String name, int age, String post, double salary,double garde) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.garde = garde;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                ", garde=" + garde +
                '}';
    }


    //业务方法

    public void introduce() {
        System.out.println(this.toString());//输出教师信息
    }
}
