package com.encap;

public class test2 {
    public static void main(String[] args) {
        Account account = new Account("jack", 60, "123454");
        account.showinfo();
    }
}
class Account {
    private String name;
    private double maney;
    private String pasword;
    public Account() {

    }
    public Account(String name, double maney, String pasword) {
        this.setName(name);
        this.setManey(maney);
        this.setPasword(pasword);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>2&&name.length()<=4) {
        this.name = name;
        } else {
            this.name = "无名";
        }
    }

    public double getManey() {

        return maney;
    }

    public void setManey(double maney) {
        if(maney >20) {
            this.maney = maney;
        } else {
            System.out.println("0");
        }
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        if(pasword.length() == 6) {
            this.pasword = pasword;
        } else {
            this.pasword = "12345678";
        }
    }
    public void showinfo() {
        System.out.println("名字" + name + "鱼额" + maney + "密码" + pasword);
    }
}
