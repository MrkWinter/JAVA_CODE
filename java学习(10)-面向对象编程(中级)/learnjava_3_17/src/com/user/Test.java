package com.user;

//import com.qing.Dog;
//
//public class Test {
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog);
//        com.xiao.Dog dog1 = new com.xiao.Dog();
//        System.out.println(dog1);
//    }
//}

//如何引入包
//import java.util.Scanner; //导入java.util 下的Scanner类
//import java.util.* //导入java.util下的所有的类
//一般使用那种类就导入那种类 不建议使用*

//import java.util.Arrays;
//
////数组排序类Arrays 可以自动导入类
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {12,45,323,676,13,56};
//        Arrays.sort(arr); //Arrays.sort(数组) 排序方法 静态方法 直接类名.方法名
//        for (int i = 0;i<arr.length; i++) {
//            System.out.println(arr[i] +" ");
//        }
//    }
//}
public class Test {
    public static void main(String[] args) {
        Modifier m1 = new Modifier(); //不同类中要先创建对象 再访问方法或属性
        System.out.println(m1.n1+ " " +m1.n2 + " "+ m1.n3 );
        //这里说明private 修饰符不能跨类访问 public protected 默认 都可以
        //idea中每个类单独是一个.java文件 这点与sublime 不同因为每个类都要生成一个
        //.class文件 所以 每个类都单独为文件思路比较清晰
        //idea每个类也就是.java文件中可以写多个 类  ？？？
        //既然类不在同一文件中 不同类文件创建对象时是如何找到对应类的信息？？
    }
}