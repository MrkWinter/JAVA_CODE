package com.mrkwinter.homework_11;
//探究向上转型和向下转型
public class Test {
    public static void main(String[] args) {
        Person s1 = new Student();//向上转型
        //编译类型为Person 运行类型为Student
        s1.run(); //从运行类型开始找 找到子类重写的run  动态绑定运行类型
        s1.eat(); //可以找到父类所有的公有方法 因为编译类型为父类
        // 能加载的只有父类的方法和属性 但运行时从子类开始查找 找到是子类中从写的run方法
        Student s2 = (Student)s1; //向下转型
        //编译类型和运行类型都为Student 相当于子类对象
        //按子类调用规则可以调用子类中所有可调用的方法 也可调用父类中的方法
        s2.run();
        s2.study();
        s2.eat();
       //这么调用父类中的run方法？？
        Student s3 = new Student();
    }
}

// == 和equals的区别
// == 基本数据类型 判断数值是否相同 对象 判断引用是否相同
// equals  object中 判断对象是否是同一引用 只能用对象
// String 等类中 object类重写 判断对象属性是否相同
