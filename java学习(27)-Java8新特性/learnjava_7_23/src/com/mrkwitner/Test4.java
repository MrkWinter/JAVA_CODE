package com.mrkwitner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aa", "bb", "cc", "dd");
        Stream<String> stream = strings.stream();
        //map 映射 遍历每个元素 对其修改为操作应的映射
        stream.map((String s) -> {
            return s.toUpperCase();
        }).forEach(System.out::println);
        String a = "s";
        a.toUpperCase();
        System.out.println(a);
    }
}
