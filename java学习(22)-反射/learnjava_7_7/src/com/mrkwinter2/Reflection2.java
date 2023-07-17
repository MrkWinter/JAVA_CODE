package com.mrkwinter2;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException {
         //1.编译阶段(类还没加载时)  多用于配置文件的时候  使用较多
        Class<?> aClass1 = Class.forName("com.mrkwinter2.Cat");
        System.out.println(aClass1);
        //2.类加载阶段(类加载完毕后直接取得) 多用于参数的传递
         Class<Cat> aClass2 = Cat.class;
        System.out.println(aClass2);
         //3.运行阶段(运行时已经得到对象实例)
        //得到的class类对象其实就是对象的运行类型
        //该运行类型就是原类的字节码文件在堆区进行类加载形成的Class类对象
        Class<? extends Cat> aClass3 = new Cat().getClass();
        System.out.println(aClass3);
        //4.通过类加载器(4种) (好像本质上是兜圈)
        //(1)得到类的类加载器 每个类都有一个
        ClassLoader classLoader = new Cat().getClass().getClassLoader();
        //(2)得到类的Class类对象
        Class<?> aClass4= classLoader.loadClass("com.mrkwinter2.Cat");
        System.out.println(aClass4);
        //5.基本数据类型的Class类对象
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        //6.基本数据类型的包装类Class类对象
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        System.out.println(integerClass == type);
        //int Integer的Class类对象是同一个
    }
}
