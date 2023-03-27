package com.extend_2;
//子类小学生
public class Pupil extends Student {
    public Pupil() { //子类构造器
        super(); // 写或不写都行 创建子类时会自动调用父类的构造器 这里是无参构造器
        this.setScore(100.0); //用父类公共方法访问私有属性或方法
    }
    public void testing() {
        System.out.println("小学生" + name + "正在考试");
    }
}
