package com.mrkwinter03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HashMap01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack","2323");
        hashMap.put("tom","223");
        Set set = hashMap.entrySet();
        Set set1 = hashMap.keySet();
        Collection values = hashMap.values();
        for (Object o : set) {
            if(o instanceof Map.Entry)
                System.out.println(((Map.Entry<?, ?>) o).getKey() );
            System.out.println(o);
        }
        for (Object o : set1) {
            System.out.println(o);
        }
        for (Object o : values) {
            System.out.println(o);
        }

    }
}
