package com.mrkwinter;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Properties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("wang","iin");
        System.out.println(properties.getProperty("wang"));
        Vector vector = new Vector();
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();

    }
}
