package com.mrkwinter.homework_8;

public class SavingAccount extends BankAccount {
    private int count = 3;
    private double rate = 0.05;
//认为免手续费的次数和利率是变的 构造器中不初始化
    public SavingAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //重写存款 和 取款方法 因为有免手续费次数

    @Override
    public void deposit(double amount) {
        if (amount <= 1) {
            System.out.println("存款金额应大于1美元");
            return;
        }
        if(count>0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额应大于0美元");
            return;
        }
        if(count >0) {
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount + 1);
        }
    }

    //月初统计上个月的类型 同时重置免费手续费次数
    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance()*this.rate);
        //将余额产生的利息无手续费的存入余额
    }
}
