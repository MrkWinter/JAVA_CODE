package com.mrkwinter03;

import java.util.Arrays;
import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //有序数组 进行查找 存在返回下标 不存在返回应该存在的位置 + 1
        int[] arr = {1,2,3,4,5,6};
        int index = Arrays.binarySearch(arr,3);
        System.out.println(index);

        //4. fill方法
        //将数组中的元素全部填充修改为指定元素
        Arrays.fill(arr,99);
        System.out.println(Arrays.toString(arr));

        //5. copyOf方法
        //将数组中的前指定元素个数的元素拷贝到另一个数组中 并返回数组引用
        //若数组中要拷贝的元素不够 则在返回数组的最后增添null
        //若要拷贝的数组元素个数为负数 则抛出异常
        int[] arr2 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr2)); //[99, 99, 99, 99, 99]

        //6. equals方法
        //比较两个数组中元素是否完全相同 相同返回true 否则返回false
        int[] arr3 = {99,99,99,99,99};
        System.out.println(Arrays.equals(arr2,arr3));//true

        //7. asList方法
        //将一个一组数转成一个List集合
        //asList 的编译类型 List(接口)
        //asList 的运行类型 class java.util.Arrays$ArrayList (Arrays的静态内部类)
        List asList = Arrays.asList(2,3,4,5);
        System.out.println("asList" + asList );
        System.out.println("asList的运行类型" + asList.getClass());
    }
}
