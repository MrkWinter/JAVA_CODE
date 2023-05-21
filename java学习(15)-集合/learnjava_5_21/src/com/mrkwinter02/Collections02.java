package com.mrkwinter02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class Collections02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("wang");
        arrayList.add("xa");
        arrayList.add("sdf");
        //1. max方法 返回集合中自然顺序的最大值 可自定义比较方法 Collection接口下使用
        Object obj = Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(obj); //wang
        //2. min方法 同上返回最小值  Collection接口下使用
        System.out.println(Collections.min(arrayList)); //sdf
        //3. frequency方法 求一个元素的出现次数 Collection接口下使用
        int count = Collections.frequency(arrayList,"wang");
        System.out.println(count); //1
        //4. copy方法 将一个集合中的数据拷贝到另一个集合 List接口下使用
        ArrayList arrayList1 = new ArrayList(arrayList); //？？
        Collections.copy(arrayList1,arrayList);
        System.out.println(arrayList1); //[wang, xa, sdf]
        //5. replaceAll方法 使用新值替换List对象中的所有旧值 List接口下使用
        Collections.replaceAll(arrayList1, "wang", "ying");
        System.out.println(arrayList1);//[ying, xa, sdf]
    }
}
