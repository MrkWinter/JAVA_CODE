package com.mrkwinter.homework_5;

public class Teacher extends Staff{
    private int day;
    private double courseSalary;

    public Teacher(double salary, int day, double courseSalary) {
        super(salary);
        this.day = day;
        this.courseSalary = courseSalary;
    }
    //特有的返回工资的方法

    @Override
    public double get_year_salary() {
        System.out.print("老师工资为：");
        return super.get_year_salary() + courseSalary*day;
    }
}

/*
Test
Demo
Rose
Jack
john
jack

 */
