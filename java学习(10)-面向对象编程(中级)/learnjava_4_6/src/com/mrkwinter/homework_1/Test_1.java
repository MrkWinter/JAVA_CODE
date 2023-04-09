package com.mrkwinter.homework_1;

public class Test_1 {
    public static void main(String[] args) {
        Person[] parry = new Person[3];
        parry[0] = new Person("wang", 19, "保洁");
        parry[1] = new Person("ling", 99, "保安");
        parry[2] = new Person("hong", 39, "农民");
        parry[0].inorder(parry);
        for (int i = 0; i < parry.length; i++) {
            System.out.println(parry[i].getName());
            System.out.println(parry[i].getAge());
            System.out.println(parry[i].getJob());
        }
        for (int i = parry.length-1;i>=0;i--) {
            System.out.println(parry[i]);//调用toString方法打印信息
        }
    }
}