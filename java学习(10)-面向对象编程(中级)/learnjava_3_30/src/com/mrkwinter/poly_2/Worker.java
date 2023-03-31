package com.mrkwinter.poly_2;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
    public String showWork() {
        return "工人 " + super.getName() + "正在工作";
    }
}
