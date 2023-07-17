package com.mrkwinter3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            //通过反射创建对象
            Class<?> aClass = Class.forName("com.mrkwinter3.User");
            //1. 通过public的无参构造器
            Object o = aClass.newInstance();
            System.out.println(o);
            //2. 通过public的有参构造器
            Constructor<?> constructor = aClass.getConstructor(int.class);
            Object o1 = constructor.newInstance(20);
            System.out.println(o1);
            //3. 通过非公有的有参构造器
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class,String.class);
            //会报错 能得到私有的构造器 但不能访问 直接调用会有问题
            declaredConstructor.setAccessible(true);
            //使用爆破 强制使用private的构造器 破除private的方法 反射 + 爆破方法访问私有的成员
            Object o3 = declaredConstructor.newInstance(100, "李四");
        System.out.println(o3);
    }
}
class User {
    private int id = 1;
    private String name = "王五";
    public User() {

    }

    public User(int id) {
        this.id = id;
    }

    private User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}