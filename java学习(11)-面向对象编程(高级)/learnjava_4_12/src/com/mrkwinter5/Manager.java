package com.mrkwinter5;

public class Manager extends Employee {
    private double bonus = 1000;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("经理"+ getName() + "正在工作中");
    }
    public double getMoney() {
        return getSalary()*12 + bonus;
    }
}
