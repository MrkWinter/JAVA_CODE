package com.mrkwinter.poly_2;
//用对象的多态实现主人喂宠物食物的问题
//定义一个Food Amimal类分别为食物和动物的父类
//定义Rice Bone Fish 类继承Food类
//定义Pig Dog Cat 类继承Animal类
//用Master中定义方法 根据两个类打印主人喂食宠物的情况
//在Test类中定义主函数 创建两个类分别是动物类和食物类
//再创建一个Master类 调用其中打印主人喂食宠物情况的方法
public class Master {
    public String showInfo(Animal a,Food b) { //父类的引用可以接收子类的对象
        //a的编译类型是Animal 运行类型可为其子类的各种对象
        //对象的多态机制 父类对象的引用(运行类型)有多种形态 可以接收子类的对象
        return "主人喂"+ a.getName() + " 吃" + b.getName();
    }
}
