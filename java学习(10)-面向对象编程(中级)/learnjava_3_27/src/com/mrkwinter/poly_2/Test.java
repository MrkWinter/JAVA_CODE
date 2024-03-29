package com.mrkwinter.poly_2;

public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat("小黄");
        Fish f1 = new Fish("带鱼");
        Master m1 = new Master();
        System.out.println(m1.showInfo(c1,f1) );
//对象多态的理解 多态的向上转型
//        1）编译类型看左边 运行类型看右边
//
//        2）可以访问父类的成员 但需要遵循访问权限
//
//        3）不可以调用子类中特有的成员
//
//（ 因为在编译阶段，决定能调用那些成员，是有编译类型来决定的 而编译类型为父类的编译类型
//
//        编译阶段只有父类被编译 子类中特有的成员属性 方法 不能访问 但最终的运行效果看子类的具体实现
//
//        因为运行阶段会先看子类的类的信息 访问方法时也是从子类开始 若子类有父类重写的方法 则访问子类
//
//        的方法）
        Animal a = new Dog("wang");
        a.show(); //可以调用子类从写父类的方法

        //多态的向下转型
       // b的编译类型为Dog 运行类型为Dog
        Dog b = (Dog)a;
        b.show2();
        System.out.println(b.getName());//可以调用父类方法
        //怎么调用父类的show方法 （该方法子类从写过 从写后父类该方法不能调用？）

        //父类的引用必须指向的对象必须和向下转型对象相同

        //总结
        // 可以用父类的引用指向子类对象 此时引用名的编译类型为 父类 运行类型为子类
        // 这称作向上转型 编译时 因为编译类型是父类 所以只能访问父类的成员 但在运行时 因为运行类型为子类
        //可能是jvm机中有子类的信息 所以访问时从子类开始访问 也就是实际运行时先看子类 是否有父类中可以识别的
        //成员
        //因为向上转型有局限 当想访问子类特有的成员时 可以将向上转型的引用名强制转换成该引用名指向对象的类型
        //这时编译类型为对应的子类 运行类型为对应的子类 编译时可以识别到子类的成员 访问时也是从对应的子类中开始
        //寻找
    }
}
