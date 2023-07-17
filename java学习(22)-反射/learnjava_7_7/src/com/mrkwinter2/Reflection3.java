package com.mrkwinter2;

import java.io.Serializable;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection3 {
    public static void main(String[] args) {
        //1. 外部类
        Class<String> cls1 = String.class;
        //2. 接口
        Class<Serializable> cls2 = Serializable.class;
        //3. 数组
        Class<int[]> cls3 = int[].class;
        Class<Integer[][]> cls_3 = Integer[][].class;
        //4. 注解
        Class<SuppressWarnings> cls4 = SuppressWarnings.class;
        //5. 枚举
        Class<Thread.State> cls5 = Thread.State.class;
        //6. 基本数据类型
        Class<Integer> cls6 = int.class;
        //7. 包装类
        Class<Integer> cls7 = Integer.class;
        //8. void类
        Class<Void> cls8 = void.class;
        //9. Class类
        Class<Class> cls9 = Class.class;
        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);
        System.out.println(cls_3);
        System.out.println(cls4);
        System.out.println(cls5);
        System.out.println(cls6);
        System.out.println(cls7);
        System.out.println(cls8);
        System.out.println(cls9);

    }
}
