package com.mrkwitner;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 23, 4, 65, 8, 64);
        //1. reduce一
        Integer reduce = integers.stream().reduce(0, (i1, i2) -> i1 + i2);
        System.out.println(reduce);
        //1. reduce二
        Optional<Integer> reduce1 = integers.stream().reduce(Integer::sum);
        System.out.println(reduce1);

        //搜集
        List<Integer> collect = integers.stream().collect(Collectors.toList());
        Set<Integer> collect1 = integers.stream().collect(Collectors.toSet());

    }
}
