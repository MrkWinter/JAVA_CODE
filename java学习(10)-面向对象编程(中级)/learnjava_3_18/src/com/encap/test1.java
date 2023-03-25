package com.encap;

public class test1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(190);
        person.setName("wang");
        person.setSalary(3000.0);
        System.out.println(person.info());
    }
}
class Person {

    public String name;
    private int age;
    private double salary;
    public Person() {

    }
    public Person(String name, int age, double salary) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary); //使用构造方法
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >=2 && name.length()<=10) { //对数据的校验
            this.name = name;
        } else {
            this.name = "aa";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<120) {  //对数据的校验
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info() {
        return "信息为 " + name + "年龄为 " + age + "薪水 " + salary;
    }
}