package com.mrkwinter.homework_8;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 1) {
            System.out.println("存款金额应大于1美元");
            return;
        }
        super.deposit(amount - 1);
        //子类无法修改父类中的私有属性
        //可以用set方法
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额应大于0美元");
            return;
        }
        super.withdraw(amount + 1);
    }
}
