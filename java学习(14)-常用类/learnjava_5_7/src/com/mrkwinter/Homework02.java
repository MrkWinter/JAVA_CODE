package com.mrkwinter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入信息");
        System.out.println("用户名(长度2~5)：");
        String name = scanner.next();
        System.out.println("密码(长度6 全为数字)：");
        String password = scanner.next();
        System.out.println("邮箱：(注意格式)：");
        String email = scanner.next();
        try {
            count mycount = setMessage(name,password,email);
            System.out.println("账户创建成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }

    public static count setMessage(String name,String password,String email) {

        char[] chars = password.toCharArray();
        boolean index = true;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(chars[i]))
                index = false;
        }
        if (!(name.length() >= 2 && name.length() <= 4 && password.length() == 6
                && index == true && email.indexOf('@') < email.indexOf('.')
                && email.indexOf('@') != -1 && email.indexOf('.') != -1)) {
            throw new RuntimeException("格式异常");
        }
        return new count(name, password, email);
        //更好的方法 采用过关斩将 将得到的形参一个个校验 若发生错误
        //抛出对应的异常 更易于修改错误
    }
}

class count {
    private String name;
    private String password;
    private String email;

    public count(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
