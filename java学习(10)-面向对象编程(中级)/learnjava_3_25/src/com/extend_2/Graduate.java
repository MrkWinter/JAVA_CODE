package com.extend_2;

//子类 大学生
public class Graduate extends Student {
    public Graduate() {
        super("xiao", 23);//使用父类中的构造方法来初始化父类 也可以不写直接使用无参默认构造器 前提是有这个构造器
        //  若子类中为定义构造器 则子类中的构造器是隐式的 隐式构造器中调用父类的无参构造器 父类中的属性在子类中表现为默认值
        // 无论如何要对父类初始化 这样才能使用父类中的属性
        //this(10.0);//无法同时使用this和super关键字 原因？本构造器中已经有super关键字初始化了父类 而用this再
        //引入别的构造器中的内容会再次初始？
        //super 和 this() 只能在构造器中使用 并且只能放在第一行
    }

    public Graduate(double score) {
        //此构造器中调用的父类的无参构造器 父类中的属性是默认值
        this.setScore(score); //用父类中的方法来设置属性
    }

    public void testing() {
        System.out.println("大学生" + name + "正在考试");
    }
}
