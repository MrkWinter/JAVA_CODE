package com.mrkwinter4;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class EightQueens {
    public static int count = 1;
    public static void main(String[] args) {
        int[] arr = new int[4];//0 ~ 7 下标代表0~7行 对应的值代表每一行的位置
        new EightQueens().eightQueueQuestion(arr, 0);
    }

    public void eightQueueQuestion(int[] arr, int n) { //n表示行数
        if(n==4) { //找到最后一行并确定后
            System.out.println("第" + (count++) + "种情况");
            printArr(arr); //打印数组
            return;
        }
        for (int i = 0; i < 4; i++) {
            arr[n] = i;//放入对应的n行 i列代表的位置
            if (suitable(arr, n)) { //若该数组中前n-1行和 第n行不冲突 则放入位置合适 到此放入一个
             eightQueueQuestion(arr,n+1); //找到下一行的正确位置
            }
        }
    }

    public boolean suitable(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if(arr[i] == arr[n])
                return false;
            if(Math.abs(n-i) == Math.abs(arr[n]-arr[i]))
                return false;
        }
        return true;
    }
    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
