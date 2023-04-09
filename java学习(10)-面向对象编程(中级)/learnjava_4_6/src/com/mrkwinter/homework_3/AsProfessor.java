package com.mrkwinter.homework_3;

public class AsProfessor extends Teacher {
//父类无默认构造器 子类要有构造器对父类进行初始化


    public AsProfessor(String name, int age,
                       String post, double salary, double garde) {
        super(name, age, post, salary, garde);
    }

    //方法重写
    public void introduce(){
        System.out.println("副教授信息：");
        super.introduce();
        //子类调用父类的方法打印的信息
        //toString方法返回的是字符串 不能直接打印
    }
}
