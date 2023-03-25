package com.encap;

public class test3 {
    public static void main(String[] args) {

        System.out.println("==== SalariedEmployee 拿固定工资的员工 ====");
        SalariedEmployee e1 = new SalariedEmployee();
        e1.setName("曹操"); // 设置员工姓名
        e1.setMonth(8); // 设置生日是8月
        e1.setMonSalary(8999); // 设置工资是8999
        System.out.println(e1.getName() + "的生日为：" + e1.getMonth() + " 月");
        System.out.println("平时月工资为：" + e1.getSalary(7));
        System.out.println("生日月工资为：" + e1.getSalary(8));

        System.out.println("\n==== HourlyEmployee 按小时拿工资的员工 ====");
        HourlyEmployee e2 = new HourlyEmployee();
        e2.setName("孙权"); // 设置员工姓名
        e2.setMonth(8); // 设置生日是8月
        e2.setHours(161); // 设置工作事件
        e2.setHourMoney(10); // 设置每小时工资
        System.out.println(e2.getName() + "的生日为：" + e2.getMonth() + " 月");
        System.out.println("平时月工资为：" + e2.getSalary(7));
        System.out.println("生日月工资为：" + e2.getSalary(8));
        System.out.println(
                "工作时间为：" + e2.getHours() + "小时\t每小时工资为：" + e2.getHourMoney());

        System.out.println("\n===SalesEmployee销售人员，工资由月销售额和提成率决定====");
        SalesEmployee e3 = new SalesEmployee();
        e3.setName("赵云"); // 设置员工姓名
        e3.setMonth(8); // 设置生日是8月
        e3.setSaleCount(58000); // 设置月销售额
        e3.setRoyaltyRate(0.19);// 设置提成率
        System.out.println(e3.getName() + "的生日为：" + e3.getMonth() + " 月");
        System.out.println("平时月工资为：" + e3.getSalary(7));
        System.out.println("生日月工资为：" + e3.getSalary(8));
        System.out.println(
                "销售额：" + e3.getSaleCount() + "\t提成率：" + e3.getRoyaltyRate());

        System.out.println("\n===BasedPlusSalesEmployee 有固定底薪的销售人员====");
        BasedPlusSalesEmployee e4 = new BasedPlusSalesEmployee();
        e4.setName("张飞"); // 设置员工姓名
        e4.setMonth(8); // 设置生日是8月
        e4.setBaseSalary(4000); // 设置底薪
        e4.setSaleCount(38000); // 设置月销售额
        e4.setRoyaltyRate(0.15);// 设置提成率
        System.out.println(e4.getName() + "的生日为：" + e4.getMonth() + " 月");
        System.out.println("平时月工资为：" + e4.getSalary(7));
        System.out.println("生日月工资为：" + e4.getSalary(8));
        System.out.println("工资 = " + e4.getBaseSalary() + " + "
                + e4.getSaleCount() + " * " + e4.getRoyaltyRate());
    }
}


 class Employee {
    private String name; // 员工姓名
    private int month; // 员工生日月

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
class Date {

        public int getMonth() {
            return 1;
        }
}
    // 获取工资方法
    double getSalary(int month) {
        Date date = new Date();
        int m = date.getMonth() + 1;
        if (month == m) {
            return 100;
        } else {
            return 0;
        }
    }
}




class SalariedEmployee extends Employee {
    private double monSalary; // 月薪

    public double getMonSalary() {
        return monSalary;
    }

    public void setMonSalary(double monSalary) {
        this.monSalary = monSalary;
    }

    // 重写获取工资方法，
    public double getSalary(int month) {
        return monSalary + super.getSalary(month);
    }
}



 class HourlyEmployee extends Employee {
    private double hourMoney; // 每小时的工资、
    private double hours; // 每月工作的小时数

    public double getHourMoney() {
        return hourMoney;
    }
    public void setHourMoney(double hourMoney) {
        this.hourMoney = hourMoney;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    // 重写计算工资的方法
    double getSalary(int month) {
        double salary = 0;
        if (hours > 160) {
            salary = (160 + (hours - 160) * 1.5) * hourMoney;
        } else {
            salary = hours * hourMoney;
        }
        return salary + super.getSalary(month);
    }
}



class SalesEmployee extends Employee {
    private double saleCount; // 月销售额、
    private double royaltyRate; // 提成率

    public double getSaleCount() {
        return saleCount;
    }
    public void setSaleCount(double saleCount) {
        this.saleCount = saleCount;
    }
    public double getRoyaltyRate() {
        return royaltyRate;
    }
    public void setRoyaltyRate(double royaltyRate) {
        this.royaltyRate = royaltyRate;
    }

    // 计算工资方法重载
    public double getSalary(int month) {
        return saleCount * royaltyRate + super.getSalary(month);
    }
}



class BasedPlusSalesEmployee extends SalesEmployee {
    private double baseSalary; // 底薪

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // 计算工资方法重载
    public double getSalary(int month) {
        return baseSalary + super.getSalary(month);
    }
}