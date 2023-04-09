package com.mrkwinter.homework_5;

public class Scientist extends Staff {
    private double bond;

    public Scientist(double salary, double bond) {
        super(salary);
        this.bond = bond;
    }
    //特有的年工资方法

    @Override
    public double get_year_salary() {
        System.out.print("科学家工资为：");
        return super.get_year_salary() + bond;
    }
}
