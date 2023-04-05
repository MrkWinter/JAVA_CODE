package com.mrkwinter.Debug;

import java.util.Arrays;

public class Debug_2 {
    public static void main(String[] args) {
        int[] arr = {1,34,56,23,12};
        Arrays.sort(arr);//排序算法
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
