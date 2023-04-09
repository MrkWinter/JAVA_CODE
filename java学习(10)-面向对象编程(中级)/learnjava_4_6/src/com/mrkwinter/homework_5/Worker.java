package com.mrkwinter.homework_5;

public class Worker extends Staff{
    public Worker(double salary) {
        super(salary);
    }

    @Override
    public double get_year_salary() {
        System.out.print("工人工资为：");
        return super.get_year_salary();
    }
}
