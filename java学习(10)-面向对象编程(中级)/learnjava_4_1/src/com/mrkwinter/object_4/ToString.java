package com.mrkwinter.object_4;

import com.sun.org.apache.xpath.internal.objects.XObject;

//toString 是object 中 的方法 默认为返回对象的包名类名 @ + 对象哈希值
//通常在子类对象中tostring被重写 返回对象的成员属性
public class ToString {
    public static void main(String[] args) {
        Monster m1 = new Monster("xio", 23, 1000);
        System.out.println(m1.toString());
        System.out.println(m1); //直接输出对象会自动调用toString方法
        System.out.println(m1.toString1());
    }
}
class Monster {
    private String name;
    private int age;
    private double salary;

    public Monster(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() { //子类重写返回成员属性
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public String toString1() {
        //原object类中toString方法
        return getClass().getName() + "@ " + Integer.toHexString(hashCode());//方法的动态绑定机制
        //getClass().getName() 得到类的全类名 包名+类名 Integer.toHexString是将哈希值转换成16进制的方法
    }
}