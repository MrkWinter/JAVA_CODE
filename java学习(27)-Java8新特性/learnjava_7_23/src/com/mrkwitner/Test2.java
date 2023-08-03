package com.mrkwitner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //创建Stream实例化对象的几种方式
        //1. 通过集合创建
        ArrayList<Object> objects = new ArrayList<>();
        Stream<Object> stream = objects.stream();//顺序流
        Stream<Object> objectStream = objects.parallelStream();//并行流
        //2. 通过数组创建对应的流
        int[] arr1 = new int[5];
        IntStream stream1 = Arrays.stream(arr1);
        //3. 通过Stream的of方法
        Stream.of(1,2,2,3,4,5);
        //4. 创建无限流
        Stream.iterate(2,t -> t + 1).limit(10).forEach(System.out::println);
        //种子是数据源 后面参数是迭代方法 指向 对该数据进行限制 最后执行遍历传入消费型函数(使用了函数引用) 打印
        Stream.generate(Math::random).limit(10).forEach((t) -> System.out.println(t));
        //根据数据源限制生成数 forEach中传入lambda表达式 通过调用函数式接口中的方法对数据进行 打印
    }
}
