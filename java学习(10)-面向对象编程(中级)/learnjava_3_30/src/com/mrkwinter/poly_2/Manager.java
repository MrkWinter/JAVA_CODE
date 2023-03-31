package com.mrkwinter.poly_2;

public class Manager extends Employee {
    private double bones;

    public Manager(String name, double salary, double bones) {
        super(name, salary);
        this.bones = bones;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bones;
    }
    public String showWork() {
        return "经理 " + getName()+ "正在管理";
    }
}
