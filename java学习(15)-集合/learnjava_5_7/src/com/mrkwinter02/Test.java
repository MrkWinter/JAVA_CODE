package com.mrkwinter02;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //下面介绍Collection接口子接口List中的方法
        //因为接口中的方法由子类实现 并且接口不能实例化 所以以该接口的实现子类ArrayList来介绍其中的方法 (同上)

        List list = new ArrayList();

        //1. add方法 在集合指定索引位置插入元素
        list.add("wang");
        list.add(0,"shan");
        System.out.println("addLink " + list);//addLink [shan, wang]

        //2. addAll方法 从集合指定索引位置插入集合 即多个元素
        List list2 = new ArrayList();
        list2.add(100);
        list2.add(200);
        list.addAll(1,list2);
        System.out.println("addAllList "+ list);//addAllList [shan, 100, 200, wang]

        //3. get方法 获取集合中指定索引位置的元素
        System.out.println(list.get(0));//shan

        //4. indexOf方法 返回集合中首次出现该元素的索引位置 相当于查找
        System.out.println(list.indexOf(new Integer(200)));//2

        //5. lastIndexOf方法 返回集合中最后一次出现该元素的索引位置
        list.add(1,100);
        System.out.println(list.lastIndexOf(new Integer(100)));//2

        //6. remove方法 移除集合中指定索引位置的元素 并将此元素返回
        Object b = list.remove(3);
        System.out.println(b);//200
        System.out.println("removeList " + list);//removeList [shan, 100, 100, wang]

        //7. set方法 将集合中指定索引位置的元素替换
        list.set(3,"ling");
        System.out.println("setList " + list);//setList [shan, 100, 100, ling]

        //8. subList方法 返回集合中指定下标间的元素组成的子集合
        List list3 = list.subList(2, 4); //注意截取为索引下标的左闭右开[2,4)
        System.out.println("subListList " + list3);//subListList [100, ling]
    }
}
