package com.mrkwinter3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //通过反射访问方法
        Class<?> aClass = Class.forName("com.mrkwinter3.Dog");
        Object o = aClass.newInstance();
        //1. 通过反射操作public方法对象
        Method cry = aClass.getMethod("cry");
        cry.invoke(o);//调用对象方法
        //2. 通过反射操作非公有方法对象
        Method jump = aClass.getDeclaredMethod("jump", String.class);
        jump.setAccessible(true);//爆破
        jump.invoke(o,"佩佩");//调用对象方法
        //3. 通过反射操作静态方法对象
        Method sleep = aClass.getDeclaredMethod("sleep", int.class, String.class);
        sleep.setAccessible(true);//爆破
        Object s = sleep.invoke(null, 2, "佩佩");//调用对象方法 静态方法可以用null替换对象
        //方法调用和普通方法调用一样也有返回值 但统一返回的是Object
        System.out.println(s); //调用toString方法 打印自己
    }
}
class Dog {
    public void cry() {
        System.out.println("汪汪汪");
    }
    private void jump(String name) {
        System.out.println(name + "跳");
    }
    private static String sleep(int age,String name) {
        String s = age + "岁" + name + "在睡觉";
        System.out.println(s);
        return s;
    }
}
