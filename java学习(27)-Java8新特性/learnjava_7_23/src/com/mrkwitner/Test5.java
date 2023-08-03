package com.mrkwitner;

import java.util.Arrays;
import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 4, 1, 6, 3, 7, 3, 789, 0);
        //1. 自然排序 使用默认的Integer的compare方法
        integers.stream().sorted().forEach(System.out::println);
        //2. 自定义排序 重新实现Comparer 接口的 compare 方法 进行自定义比较
        integers.stream().sorted((e1,e2) -> e2-e1).forEach(System.out::println);
    }
}
