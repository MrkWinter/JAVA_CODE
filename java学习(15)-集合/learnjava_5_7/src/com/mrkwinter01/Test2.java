package com.mrkwinter01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class Test2 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //Collection 接口中有iterator方法 该方法规定实现子类(集合类)都能生成对应的迭代器(Iterator对象)
        //可以用该迭代器来遍历集合中元素  但迭代器本身并不存放对象
        //迭代器遍历集合中元素的原理：
        //迭代器中规定元素指针 默认指向第0个元素 由特定方法遍历指向所有集合元素
        //迭代器中有 hasNext 和 next方法 hsaNext用于判断集合中是否有下一个元素
        //next方法用于将集合中指向元素的指针下移 并且将下移后指针位置上的元素返回
        //使用next方法前要使用hasNext判断下一个指针指向的位置是否有集合元素 否则抛出异常

        Collection bookList = new ArrayList(); //向上转型
        bookList.add(new Book("云边有个小卖部", 39));
        bookList.add(new Book("刻意练习", 50));
        bookList.add(new Book("编程的艺术", 79));
        System.out.println(bookList);
        //直接输出 比较复杂 但最后调用了Book中的toString方法该方法重写的是父类Object类的

        //用Collection接口类的实现子类集合调用 iterator方法来得到 Iterator类的对象 (迭代器)来遍历集合元素
        Iterator iterator = bookList.iterator();
        while (iterator.hasNext()) { //必须使用hasNext方法判断 不然抛出异常
            Object next = iterator.next();//每次指向集合中的一个元素直到最后
            System.out.println(next);//根据动态绑定机制 调用Book中的toString方法
        }
        //在经过一次遍历后 原迭代器的指向集合元素的指针指向最后 若再次使用iterator.next()则会抛出异常
        //若想再次遍历 需要重置迭代器 即用集合对象再次调用iterator方法 返回一个新的迭代器

        //可以使用增强for循环来遍历集合中的元素
        //增强for循环的底层还是调用inerator方法 使用迭代器
        //可以理解为增强for是简化版本的迭代器
        for (Object obj : bookList) {
            //每次将next指针指向下一位 并返回指针指向的集合对象 用obj接收
            System.out.println(obj);//调用toString方法
        }

        //增强for还可以用来遍历数组
        //底层是？
        int[] arr = {1, 3, 5, 7, 9};
        for (int i : arr) {
            System.out.println(i);//1 3 5 7 9
        }

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}