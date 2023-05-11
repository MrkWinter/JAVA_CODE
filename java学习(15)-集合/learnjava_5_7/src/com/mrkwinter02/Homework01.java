package com.mrkwinter02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1buruniya");
        list.add("2ailixiya");
        list.add("3diaidii");
        list.add("42302323");
        list.add("5wwerafw");
        list.add("6efiawf");
        list.add("7cvdfgewfe");
        list.add("8wondoeda");
        list.add("9euiirwwer");
        list.add("10er34df");
        list.add(1,"韩水平教育");
        Object o = list.get(5);
        System.out.println(o);
        list.remove(5);
        list.set(6, "haha");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
