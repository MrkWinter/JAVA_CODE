package com.mrkwinter.override;

public class Dog extends Animal{
    //子类中有和父类中方法名相同的方法
    //并且方法的定义形式 （名称 参数 返回类型）相同
    //这时称子类的方法重写了父类的方法 方法的重写 覆盖
    public void cry() {
        System.out.println("汪汪汪");
    }
}
