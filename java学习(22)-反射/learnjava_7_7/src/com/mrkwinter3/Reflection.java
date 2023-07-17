package com.mrkwinter3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. 得到 Class 对象
        Class<?> peopleCls = Class.forName("com.mrkwinter3.People");
        //2. getName:获取全类名
        System.out.println(peopleCls.getName());
        //3. getSimpleName:获取简单类名
        System.out.println(peopleCls.getSimpleName());
        //4. getFields:获取所有 public 修饰的属性 对象，包含本类以及父类的
        for (Field field : peopleCls.getFields()) {
            System.out.println(field.getName());
        }
        //5. getDeclaredFields:获取本类中所有属性 对象
        for (Field declaredField : peopleCls.getDeclaredFields()) {
            System.out.println(declaredField.getName());
        }
        //6. getMethods:获取所有 public 修饰的方法 对象，包含本类以及父类的
        for (Method method : peopleCls.getMethods()) {
            System.out.println(method.getName());
        }
        //7. getDeclaredMethods:获取本类中所有方法 对象
        for (Method declaredMethod : peopleCls.getDeclaredMethods()) {
            System.out.println(declaredMethod.getName());
        }
        //8. getConstructors: 获取所有 public 修饰的构造器 对象，包含本类
        for (Constructor<?> constructor : peopleCls.getConstructors()) {
            System.out.println(constructor);
        }
        //9. getDeclaredConstructors:获取本类中所有构造器 对象
        for (Constructor<?> declaredConstructor : peopleCls.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }
        //10. getPackage:以 Package 形式返回 包信息
        System.out.println(peopleCls.getPackage());
        //11. getSuperClass:以 Class 形式返回父类信息 (得到父类的Class类对象)
        System.out.println(peopleCls.getSuperclass());
        //12. getInterfaces:以 Class[]形式返回接口信息 (得到接口类的Class类对象)
        for (Class<?> anInterface : peopleCls.getInterfaces()) {
            System.out.println(anInterface);
        }
        //13. getAnnotations:以 Annotation[] 形式返回注解信息 (得到注解的Class类对象)
        for (Annotation annotation : peopleCls.getAnnotations()) {
            System.out.println(annotation);
        }
    }
}

interface A {

}

interface B {

}

@Deprecated
class Human {
    public String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {

    }

    private void eat() {

    }
}

@Deprecated
class People extends Human implements A, B {
    public String hobby;
    private int id;

    public People() {
    }

    public People(String hobby, int id) {
        this.hobby = hobby;
        this.id = id;
    }

    public void call() {

    }

    private void teach() {
    }
}
