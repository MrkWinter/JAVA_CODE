package com.mrkwinter2;

import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
//用异常控制用户输入的必是整数
public class Test {
    private static String name;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean index = true;
        int  num1 = 0;
        while(index) {
            System.out.println("请输入一个整数");
            String num = scanner.next();
            try {
                num1 = Integer.parseInt(num);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("输入的整数为" + num1 );
    }
}
