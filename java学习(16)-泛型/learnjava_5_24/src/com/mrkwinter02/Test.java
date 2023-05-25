package com.mrkwinter02;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

    }
}

class Son<T> {
    private T t;
    private T d;
    private T efe;

    public T getEfe() {
        return efe;
    }

    public void setEfe(T efe) {
        this.efe = efe;
    }

    public T getQ() {
        return q;
    }

    public void setQ(T q) {
        this.q = q;
    }

    private T q;

    public T getD() {
        return d;
    }

    public void setD(T d) {
        this.d = d;
    }

    public Son(T t, T d, int age) {
        this.t = t;
        this.d = d;
        this.age = age;
    }

    private int age;

    public Son(T t, int age) {
        this.t = t;
        this.age = age;
    }

    //泛型数据getter setter方法名和普通属性一样 get/set + 变量名首字母大写变量名
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}