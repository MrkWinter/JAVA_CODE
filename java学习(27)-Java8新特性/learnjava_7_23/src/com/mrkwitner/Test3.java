package com.mrkwitner;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test3 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();
        Stream<Object> stream = objects.stream();
        //1. 过滤限制
        stream.filter(o -> o != null).forEach(System.out::println);
        //2. 截断限制
        stream.limit(10).forEach(t -> System.out.println(t));
        //3. 跳过限制
        stream.skip(10).forEach(System.out::println);
        //4. 去重限制
        stream.distinct().forEach(System.out::println);


    }
}
