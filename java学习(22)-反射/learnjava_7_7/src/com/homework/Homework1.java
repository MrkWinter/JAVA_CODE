package com.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Homework1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("java.io.File");
        //得到构造器对象
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        //创建File对象
        Object o = declaredConstructor.newInstance("a.txt");
        //得到createFile方法对象
        Method createNewFile = aClass.getDeclaredMethod("createNewFile");
        //反射调用方法
        Object invoke = createNewFile.invoke(o);
        System.out.println("创建文件" + invoke);
    }
}
