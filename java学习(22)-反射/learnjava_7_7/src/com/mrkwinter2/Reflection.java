package com.mrkwinter2;

import javafx.animation.ScaleTransition;

import java.lang.reflect.Field;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1. 根据类全路径得到Class类对象
        Class<?> cla = Class.forName("com.mrkwinter2.Cat");
        //2. 输出Class类对象会输出该Class类是由哪个类生成的 (全类名)
        System.out.println(cla);
        System.out.println(cla.getClass());
        //3. 得到包名
        String name = cla.getPackage().getName();
        System.out.println(name);
        //4. 得到 全类名 该Class类是由哪个类生成的
        System.out.println(cla.getName());
        //5. 通过Class类对象得到对象实例
        // 直接由类对象复制实例化一个对象 得到的这个普通对象和下面的属性 方法 构造器对象不太一个
        Cat o = (Cat)cla.newInstance(); //这里得到的是真对象
        o.cry();
        //6. 通过反射获取属性对象  通过Class类对象获取类对象中的属性对象
        //这里是从里往外看 Class类对象中的属性对象只有一个 而该类普通的对象的实例有多个
        Field age = cla.getField("age");
        System.out.println(age.get(o)); //含义是得到o对象中的age属性
        //7. 通过反射给属性赋值
        //这里很有意思 Class类中属性对象有修改对应对象属性的权限
        Cat cat = new Cat();
        age.set(cat,90);
        System.out.println(cat.age);
        //8. 通过反射获取所有属性对象
        Field[] fields = cla.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].get(cat)); //打印cat对象中的所有属性
        }
    }
}
