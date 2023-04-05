package com.mrkwinter.object_3;
//hashcode是object中的方法 返回对象的哈希值 哈希值根据地址返回
//子类中往往会重写hashCode方法
public class HashCode {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A a1 = a;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a1.hashCode());
        //指向同一对象哈希值相同 不同对象哈希值一般不相同
    }
}
class A {

}