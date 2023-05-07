package com.mrkwinter04;

import java.util.Arrays;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //1. exit方法
        //根据接收数据结束程序
        System.out.println("hello");
        //System.exit(0);
        System.out.println("hi");

        //2. arraycopy方法
        //根据指定输入变量将数组进行数组拷贝
        //arrycopy(源数组，开始拷贝位置，目标数组，接收拷贝位置，拷贝元素个数)
        int[] arr = {1,3,4,5};
        int[] arr1 = new int[5];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.out.println(Arrays.toString(arr1));//[1, 3, 4, 5, 0]

        //3. currentTimeMillens 方法
        //返回当前时间距离 1970-1-1 的毫秒数
        System.out.println(System.currentTimeMillis());

        //4. gc 方法
        //运行垃圾回收机制
        System.gc();
    }
}
