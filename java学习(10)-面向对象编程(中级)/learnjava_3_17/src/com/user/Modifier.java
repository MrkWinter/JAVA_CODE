package com.user;

public class Modifier {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    //同类中四种访问修饰符 修饰的属性 都能使用
    public void print() {
        System.out.println(n1+" "+ n2 +" "+ n3+ " " +n4); //这里说明同类四种修饰符都可访问
    }
}
