package com.mrkwinter01;

import java.util.*;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //下面介绍集合的父类接口Collection中的方法
        //因为接口中的方法由子类实现 并且接口不能实例化 所以以该接口的实现子类ArrayList来介绍其中的方法
        List list = new ArrayList(); //这里使用父类接口的引用接收实现子类 向上转型

        //1. add方法 添加集合中单个元素
        list.add("jack");
        list.add(1000); //存在自动装箱 new Integer(1000)
        list.add(false); //new Boolean(false);
        System.out.println("addList"+ list ); //根据运行类型调用ArrayList对象中的toString方法 addList[jack, 1000, false]

        //2. remove方法 删除集合中指定元素
        list.remove(0);//删除第一个元素 并返回删除对象
        list.remove(new Integer(1000));//指定删除整形包装类对象1000
        System.out.println("removeList" + list); //removeList[false]

        //3. contains方法 查找集合中元素是否存在
        System.out.println(list.contains(false)); //true

        //4. size方法 获取集合中元素个数
        System.out.println(list.size()); //1

        //5. isEmpty方法 判断集合是否为空
        System.out.println(list.isEmpty()); //false

        //6. clear方法 清空集合中所有元素 将集合置为空
        list.clear();
        System.out.println(list.isEmpty());//true

        //7. addAll方法 将另一个集合添加到当前集合中 添加多个元素
        List list2 = new ArrayList();
        list2.add(90);
        list2.add("tom");
        list.addAll(list2);
        System.out.println("addAllList " + list); //addAllList [90, tom]

        //8. removeAll方法 根据另一个集合的元素将当前集合中元素删除 删除多个元素
        list.add(true);
        list.removeAll(list2);
        System.out.println("removeAlList " + list); //removeAlList [true]

        //9. containsAll方法 根据另一个集合元素查找当前集合元素是否都存在 查找多个元素
        System.out.println(list.containsAll(list2)); //false

    }
}
