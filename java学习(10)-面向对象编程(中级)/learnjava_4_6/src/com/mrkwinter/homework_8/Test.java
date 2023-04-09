package com.mrkwinter.homework_8;

public class Test {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(1000);
        c1.deposit(12);
        c1.withdraw(10);
        System.out.println(c1.getBalance());

        SavingAccount s1 = new SavingAccount(2000);
        s1.deposit(10);
        s1.withdraw(10);
        s1.deposit(10); //三次免费
        s1.withdraw(9); //一元手续费 还剩2000
        System.out.println(s1.getBalance());
        s1.earnMonthlyInterest();//一个月产生利息 重置免费次数
        System.out.println(s1.getBalance());
        s1.deposit(1000);
        System.out.println(s1.getBalance());//利息+ 1000
    }
}
