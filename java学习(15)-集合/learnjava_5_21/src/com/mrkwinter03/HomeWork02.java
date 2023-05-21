package com.mrkwinter03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HomeWork02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("smith",2900);
        hashMap.put("tom",1200);
        hashMap.replace("jack",2600);
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (java.util.Map.Entry) iterator.next();
            hashMap.replace(next.getKey(),(int)next.getValue() +100);
        }
        System.out.println(hashMap);
        Iterator iterator1 = hashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }
        Iterator iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next);
        }
    }
}
