package com.mrkwinter;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("jack");
        hashSet.add("luck");
        hashSet.add("jack");
        hashSet.add("null");
        for (Object o : hashSet) {
            System.out.println(o);
        }
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println(hashSet);

    }
}
