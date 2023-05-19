package com.mrkwinter03;

import javax.xml.soap.Node;
import java.util.*;

/**
 * @author MrkWinter
 * @version 1.0
 */@SuppressWarnings("all")
public class HashMapFor {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("an","ling");
        hashMap.put("xi","wen");
        //第一组 先取出所有的Key 然后遍历
        Set keySet = hashMap.keySet(); //keySet是一个集合 里面包含Node数组中所有的Key值
        //(1)增强for

        for (Object o : keySet) {
            System.out.println(hashMap.get(o)); //通过Map中方法 用key对象找到对应的value值
        }
        //(2)Interator迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(hashMap.get(next)); //本质相同 拿到key对象 通过get方法找到value
        }
        //第二组 先取出所有的Value 然后遍历
        Collection values = hashMap.values(); //values是一个集合 里面包含Node数组中所有的values值
        //(1)增强for
        for (Object o : values) {
            System.out.println(o);
        }
        //(2)Interator迭代器
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            System.out.println(next);
        }
        //第三组 通过EntrySet 来获取k - value
        Set set = hashMap.entrySet();
        //(1)增强for
        for (Object o : set) {
            Map.Entry o1 = (Map.Entry) o;
            System.out.println(o1.getKey() + "--" + o1.getValue());
        }
        //(2)Interator迭代器
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Map.Entry next = (Map.Entry)iterator1.next();//向上转型
            System.out.println(next.getKey() + "--" + next.getValue());
        }
    }
}
