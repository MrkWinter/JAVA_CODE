package com.mrkwinter6;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
class A {
    private String name = "wang";
    public void show() {
        class B {
            private final String NAME = "ling";
            public void show() {
                System.out.println("局部内部类中show方法被调用 " +NAME);
                System.out.println(A.this.name);
            }
        };
        B b = new B();
        b.show();
    }
}
