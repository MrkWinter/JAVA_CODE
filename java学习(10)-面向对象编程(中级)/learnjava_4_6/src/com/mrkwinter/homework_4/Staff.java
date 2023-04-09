package com.mrkwinter.homework_4;

public class Staff {
    private String name;
    private double day_salary;
    private int day;
    private double grade;

    public Staff(String name, double day_salary, int day, double grade) {
        this.name = name;
        this.day_salary = day_salary;
        this.day = day;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDay_salary() {
        return day_salary;
    }

    public void setDay_salary(double day_salary) {
        this.day_salary = day_salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    //返回员工的基本工资
    public String ret_salary() {
     return "" + day*day_salary*grade;
    }
}
