package com.mrkwinter.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP 面向对象思想编程
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    double money = 0;
    double balance = 0;
    Date date = null;
    String details = "-------------零钱通明细-------------";
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void mainMenu() {
        String key;
        do {
            System.out.println("========O零钱通菜单P=======");
            System.out.println("1.零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("请选择1~4");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择错误");
            }
        } while (loop);

    }

    public void details() {
        System.out.println(details);
    }

    public void income() {
        System.out.println("收益入账金额：");
        //创建变量输入数据
        money = scanner.nextDouble();//!!! 尽量找不正确的地方 较容易 挑刺容易 找对难
        if (money <= 0) {
            System.out.println("收入金额应大于0!!!");
            return;
        }
        balance += money;

        date = new Date(); //获取当前信息
        details += "\n收益入账:+" + money + "\t日期:" + sdf.format(date) + "\t余额:"
                + balance;
    }

    public void pay() {
        System.out.println("输入消费金额");
        money = scanner.nextDouble();
        if (money <= 0 || balance - money < 0) {
            if (money < 0) {
                System.out.println("消费金额应大于0!!!");
            } else {
                System.out.println("消费金额大于余额!!!");
            }
            return;
        }
        balance -= money;
        System.out.println("输入消费说明");
        String note;
        note = scanner.next();
        date = new Date();
        details += "\n消费入账:-" + money + "\t消费说明:" + note + "\t日期:" + sdf.format(date) + "\t余额:"
                + balance;
    }

    public void exit() {
        String choice = "";
        while (!(choice.equals("y") || choice.equals("n"))) {

            System.out.println("你确定退出吗？y/n");
            choice = scanner.next();
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
