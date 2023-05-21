package com.mrkwinter02;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Collections01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("wang");
        arrayList.add("xa");
        arrayList.add("sdf");
        //1. reverse方法
        Collections.reverse(arrayList);
        System.out.println(arrayList); //[sdf, xa, wang]
        //2. shuffle方法
        Collections.shuffle(arrayList);
        System.out.println(arrayList);//[sdf, wang, xa]
        //3. sort方法 按元素自然顺序进行排序(字符串大小) 可以传入排序方法
        Collections.sort(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(arrayList);//[xa, sdf, wang]
        //4.swap方法 将集合中对应位置的元素进行交换
        Collections.swap(arrayList,0,2);
        System.out.println(arrayList);//[wang, sdf, xa]
    }
}
