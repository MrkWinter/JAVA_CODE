package com.mrkwinter;
//java 动态绑定机制
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B(); //向上转型
        //System.out.println(a.getsum());//40 调用方法看运行类型B 并且与运行类型B绑定
        //调用方法时有调用属性i 属性没有动态绑定机制 在那个类调用就使用那个 （就近原则）
//将子类重写的getsum去除
        System.out.println(a.getsum()); //30
        //由于继承机制 getsum调用的是父类的方法 父类方法中调用了gets方法 由于a对象的运行类型
        //为B 所以动态绑定了B 在调用gets方法时从子类B开始查找 因为调用属性没有动态绑定机制
        // 返回子类i的值
        //综上还是一句 直接调用属性看编译类型 间接调用属性看所在位置 调用方法看运行类型
    }
}
class A {
   public int i = 10;
    public int getsum() {
        return gets()+ 10;
    }
   public  int gets() {
        return i;
    }
}
class B extends A {
    public int i = 20;
//    int getsum() {
//        return i + 20;
//    }
    public int gets() {
        return this.i;
    }
}
