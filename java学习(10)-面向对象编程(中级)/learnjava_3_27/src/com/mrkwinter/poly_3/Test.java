package com.mrkwinter.poly_3;

public class Test {
    public static void main(String[] args) {
        Base s1 = new Sub(); //编译类型为Base
        System.out.println(s1.age); //10
        Sub s2 = new Sub(); //编译类型为Sub
        Sub s3 = (Sub)s1;//向下转型
        System.out.println(s2.age); //20
        //综上 属性没有重写之说 属性值看编译类型 编译了才能访问
        //若s2无age 也能访问父类的age 是因为继承关系 编译子类的同时
        //编译了父类 而上面对象多态的向上转型 只编译父类
        // 向下转型编译子类  所以向下转型
        //和创建的普通的子类对象相同？ 都能访问父类？

        System.out.println(s1 instanceof Sub);//s1的运行类型为Sub true
        System.out.println(s2 instanceof Base);//s2的运行类型为Sub 为Base 的子类型 true
        System.out.println(s1 instanceof Sub); //true
    }
}
class Base {
    int age = 10;
}
class Sub extends Base {
    int age = 20;
}
