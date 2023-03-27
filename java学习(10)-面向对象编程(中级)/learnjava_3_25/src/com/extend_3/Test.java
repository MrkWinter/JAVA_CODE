package com.extend_3;

public class Test {
    public static void main(String[] args) {
        Son s1 = new Son();
        Son s2; //栈区形成一个地址
        s2=new Son(); //该地址指向对象空间
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.hobby);
    }
}
class Grandfather { //爷类
    String name = "中头爷爷";
    String hobby = "打篮球";
}
class Father extends Grandfather { //父类
    String name = "小头爸爸";
    int age;
}
class Son extends Father { //子类
    String name = "大头儿子";
}
//    创建子类对象时 系统会先在jvm虚拟机的方法区依次加载object类的信息 Grandfather爷类的的信
//        息 Father类的信息 Son类的信息 根据类在堆区开辟存储对象s1的空间 然后将Grandfather类中属
//        性的name 和 hobby存储在堆区 （注意堆区储存的是字符串的地址 是先在方法区的常量池开辟空间
//        后返回地址到堆区储存） 然后将Father类的属性name 和 age 存储到堆区 （字符串为引用类型数
//        据 堆区储存的还是地址 引用类型数据有 对象 数组 字符串 传递时是地址） 最后将Son类的name属
//        性存储到堆区 最后这一整块区域的地址返回给在栈区开辟一块空间的s1 s1是该对象的引用