package com.mrkwinter.homework_10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //重写 object 中的equals方法 原equals方法是判断是否是同一对象
    //现在判断对象的属性是否相同
    @Override
    public boolean equals(Object obj) {
        if(this == obj) //判断该对象是否是一个对象 == 判断对象时判断的是 是否是一个引用
            //即地址是否相同
            return true;
        if(!(obj instanceof Doctor))
            return false; //挑刺法 过关斩将法

        Doctor d1 = (Doctor)obj; //向下转型
        if(age == d1.age&&name.equals(d1.name)&&job.equals(d1.job)
                &&gender == d1.gender && salary == d1.salary) {
            return true;
        }
        return false;
    }
}