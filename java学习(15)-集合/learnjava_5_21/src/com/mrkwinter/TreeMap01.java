package com.mrkwinter;

import java.util.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeMap.put("wang","qing");
        treeMap.put("wag","qing");
        treeMap.put("wn","qing");
        treeMap.put("gd","qing");
        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(((Map.Entry)next).getKey());
        }
    }
}
