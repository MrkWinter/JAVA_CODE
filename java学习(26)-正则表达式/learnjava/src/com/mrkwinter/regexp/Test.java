package com.mrkwinter.regexp;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        double random = Math.random() * 100 + 1;

    }
}

abstract class T {
    public static final int[] arr = new int[10];

    public static void main(String[] args) {
        Integer q = 128;
        Integer b = 128;
        System.out.println(q.equals(b));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*2;
        }
        System.out.println(Arrays.toString(arr));
//[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
        System.out.println(Arrays.binarySearch(arr,5));


        System.out.printf("sss");


    }

    public void b() {
        a();
        arr[1] = 1;
    }

    public void a() {
        try {
            File nnn = new File("nnn");
            boolean newFile = nnn.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        c();
    }
    public<R>  void c() {
    }
}

enum Season {
    WINTER("wang"),
    SEASON("li");

    private String name;

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}