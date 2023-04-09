package com.mrkwinter.homework_4;

public class CommonStaff extends Staff {
    public CommonStaff(String name, double day_salary,
                       int day, double grade) {
        super(name, day_salary, day, grade);
    }
//重写打印工资方法

    @Override
    public String ret_salary() {
        return "普通员工姓名：" + getName() + "工资为：" + super.ret_salary();
    }
}
