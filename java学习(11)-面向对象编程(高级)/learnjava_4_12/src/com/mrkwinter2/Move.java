package com.mrkwinter2;

import java.util.SplittableRandom;

public class Move {
    private String name;
    private double prise = getPrice();
    private String director;
    private static int time = getTime();//因为静态属性初始化只能调用静态方法
    //类加载要按属性 先是静态 在是普通 最后构造器 不能静态还未加载 就加载普通

    public static int getTime() {
        System.out.println("静态属性调用");
        return 100;
    }
public double getPrice() {
    System.out.println("普通属性调用");
    return 100.0;
}
    //创建对象 初始化属性 自动调用构造器    然后先调用代码块 再调用构造器
    //可以理解为代码块是构造器的补充 同时可以解决代码冗余的情况
    static {
        System.out.println("j电影结束");
        System.out.println("j电影结束");
    }

    ;

    {
        System.out.println("电影开始");
        System.out.println("电影结束");
    }

    ;

    public Move(String name) {
        System.out.println("构造器1");
        this.name = name;
    }

    public Move(String name, double prise) {
        System.out.println("构造器2");
        this.name = name;
        this.prise = prise;
    }

    ;

    public Move(String name, double prise, String director) {
        System.out.println("构造器3");
        this.name = name;
        this.prise = prise;
        this.director = director;
    }

    public static void print() {
        System.out.println("类加载");
    }
}
