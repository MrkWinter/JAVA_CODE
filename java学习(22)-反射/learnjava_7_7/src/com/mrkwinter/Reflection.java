package com.mrkwinter;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //读取配置文件
        Properties properties = new Properties();
        properties.load(new FileReader("my.properties"));
        //根据名字得到加载类
        Class<?> cla = Class.forName((String) properties.get("class"));
        //得到加载类的对象实例
        Object cat = cla.newInstance();
        //得到加载类的方法对象实例
        Method method = cla.getMethod((String) properties.get("method"));
        method.setAccessible(true);
        method.invoke(cat);
        //得到加载类的字段对象
        Field name = cla.getField("name");
        System.out.println(name.get(cat));
        //得到加载类的构造器对象
        Constructor<?> constructor = cla.getConstructor();
        System.out.println(constructor);
        Constructor<?> constructor1 = cla.getConstructor(String.class);//这里传入的是String类的Class类
        System.out.println(constructor1);
        //构造器可创建对象
    }
}
