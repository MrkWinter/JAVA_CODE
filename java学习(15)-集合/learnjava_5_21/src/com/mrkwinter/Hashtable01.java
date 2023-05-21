package com.mrkwinter;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Hashtable01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("w", 1);
        //Hashtable 扩容机制
        //进入put方法中的 addEntry(hash, key, value, index);
        //判断 如果数组大小大于临界值 rehash(); 进行扩容 扩容按原本数组大小*2+1的方式进行
        Set set = hashtable.entrySet();
    }
}
