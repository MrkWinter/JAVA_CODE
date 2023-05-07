package com.mrkwinter03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //Array类中的方法
        //1. toString 方法
        // toString将数组中的元素拼接成字符串 返回String类对象
        Integer[] arr = {10,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        //2. sort 方法
        //将数组中元素进行排序 可以自己传入compare函数进行自定义比较
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 10]
        //传入 compare 方法
        Arrays.sort(arr,new Comparator(){
            //通过匿名内部类实现并传入Comparator接口
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o2 - (Integer)o1;
            }
        });
        System.out.println(Arrays.toString(arr));//[10, 5, 4, 3, 2]

    }
}
