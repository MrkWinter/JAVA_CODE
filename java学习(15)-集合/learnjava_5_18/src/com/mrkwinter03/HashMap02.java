package com.mrkwinter03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings("all")
public class HashMap02 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        //1. put方法 将一个键值对放入Node数组
        hashMap.put("an","ling");
        hashMap.put("xi","wen");
        //2. remove方法 根据键删除一组映射关系
        hashMap.remove("an");
        //3. get方法 根据键获取值
        Object xi = hashMap.get("xi");
        System.out.println(xi);
        //4. size方法 获取元素个数
        System.out.println(hashMap.size());
        //5. isEmpty方法 判断元素个数是否为空
        System.out.println(hashMap.isEmpty());
        //6. clear方法 清除k-value
        hashMap.clear();
        //7. containsKey方法 查找键是否存在
        System.out.println(hashMap.containsKey("xi"));

    }
}
