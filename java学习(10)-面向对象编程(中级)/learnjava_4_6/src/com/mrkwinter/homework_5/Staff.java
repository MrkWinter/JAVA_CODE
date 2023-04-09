package com.mrkwinter.homework_5;

//打印年工资
public class Staff {
    private double salary;
    private int month = 12;

    public Staff(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //返回年基本工资的方法
    public double get_year_salary() {
        return salary * month;
    }
}
