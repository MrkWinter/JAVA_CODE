package com.mrkwinter.homework_4;

public class Manager extends Staff {
    private double bond;

    public Manager(String name, double day_salary,
                   int day, double grade, double bond) {
        super(name, day_salary, day, grade);
        this.bond = bond;
    }

    @Override
    public String ret_salary() {//把字符串转换成数字
        return "经理姓名为：" ;
                // getName()+((double)Integer.parseInt(super.ret_salary()) + bond);
                //报错 ？？？字符串转换成整数的方法
    }
}
