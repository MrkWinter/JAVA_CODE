package com.mrkwinter02;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class LinkedHashSet01 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("wang");
        linkedHashSet.add("wen");
        linkedHashSet.add("xing");
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
