package com.mrkwinter;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
//        String name = null;
//        System.out.println(name.length());
//        int []arr = {1,3,4};
//        System.out.println(arr[3]);
//        A a = new B(); //向上转型
//        B b = (B)a; //向下转型
//        C c = (C)a; //B和C都是A的子类 但B和C没有关系
        String name = "wang";
        int num = Integer.parseInt(name);//数字格式不正确异常

    }
}
class A {

}
class B extends A {

}
class C extends A {

}

