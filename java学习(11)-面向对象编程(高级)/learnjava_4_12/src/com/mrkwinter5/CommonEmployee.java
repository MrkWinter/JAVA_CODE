package com.mrkwinter5;

public class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }
    @Override
    public void work() {
        System.out.println("普通工人" +getName()+ "正在工作中");
    }

    @Override
    public double getMoney() {
        return getSalary()*12;
    }
}
