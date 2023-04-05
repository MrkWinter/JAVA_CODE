package com.mrkwinter.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date; //引入新包中的类 可以显示日期
import java.util.Scanner;
//面向过程的编程方法实现
public class SmallChanges {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key;


        String details = "-------------零钱通明细-------------";

        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note;
        do {
            System.out.println("=======零钱通菜单=======");
            System.out.println("1.零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("请选择1~4");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    //创建变量输入数据
                    money = scanner.nextDouble();//!!! 尽量找不正确的地方 较容易 挑刺容易 找对难
                    if (money <= 0) {
                        System.out.println("收入金额应大于0!!!");
                        break;
                    }
                    balance += money;

                    date = new Date(); //获取当前信息
                    details += "\n收益入账:+" + money + "\t日期:" + sdf.format(date) + "\t余额:"
                            + balance;

                    break;
                case "3":
                    System.out.println("输入消费金额");
                    money = scanner.nextDouble();
                    if(money<=0 || balance - money <0) {
                        if(money<0){
                            System.out.println("消费金额应大于0!!!");
                        } else {
                            System.out.println("消费金额大于余额!!!");
                        }
                        break;
                    }
                    balance -= money;
                    System.out.println("输入消费说明");
                    note = scanner.next();
                    date = new Date();
                    details += "\n消费入账:-" + money + "\t消费说明:" + note + "\t日期:" + sdf.format(date) + "\t余额:"
                            + balance;
                    break;
                case "4":
                    String choice = "";
                    while (!(choice.equals("y") || choice.equals("n"))) {

                        System.out.println("你确定退出吗？y/n");
                        choice = scanner.next();
                    }
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择错误");
            }
        } while (loop);
    }
}
