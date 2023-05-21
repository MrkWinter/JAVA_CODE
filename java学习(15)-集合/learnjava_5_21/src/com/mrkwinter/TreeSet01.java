package com.mrkwinter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            //return ((String)o1).length() - ((String)o2).length();
            }
        });
        //treeSet底层是treeMap treeSet构造器可以传入compartor接口类实现的 对象 根据该对象将数据进行排序
        //若不传入 按原有方式进行存储 并不是有序的
        //compator比较器最后传入到了TreeSet的底层的TreeMap 的compator属性
        //compator 比较器可以根据比较的返回值将 数据进行排序 比较返回值为0认为是同一元素 不加入
        // 比较返回值大于0 或 小于0 可以决定排序方式
        treeSet.add("wang");
        treeSet.add("xing");
        treeSet.add("ling");
        treeSet.add("hong");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
