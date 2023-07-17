package com.mrkwinter3;

import java.lang.reflect.Field;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection3 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        //反射操作属性
        Class<?> aClass = Class.forName("com.mrkwinter3.Student");
        Object o = aClass.newInstance();
        //1. 反射操作public属性对象
        Field age = aClass.getField("age");
        age.set(o,18); //设置属性
        System.out.println(age.get(o)); //得到属性
        //2. 反射操作非公有属性对象
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true); //爆破私有属性
        name.set(o,"张三"); //设置属性
        System.out.println(name.get(o));//得到属性
        //3. 反射操作静态属性对象
        Field duty = aClass.getDeclaredField("duty");
        duty.setAccessible(true);
        duty.set(null,"学习呀");  //设置属性
        //静态属性可以用null代替对象 (当然也可以用实例) 因为静态属性和类相关 和对象无关
        System.out.println(duty.get(null)); //得到属性
        //整个输出对象
        System.out.println(o);
    }
}
class Student {

    public int age;
    private String name;
    private static String duty = "学习";

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}' + duty;
    }
}