package com.mrkwinter01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author MrkWinter
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSetHomework {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("wang", 13));
        hashSet.add(new Employee("xing", 34));
        hashSet.add(new Employee("xing", 34));
        hashSet.add(new String("dada"));
        hashSet.add(new String("dada"));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this)
//            return true;
//        if (obj instanceof Employee) {
//            return ((Employee) obj).age == age && ((Employee) obj).name == name;
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
        //系统重写的equals方法 若年龄和名字内容都相同 则返回真
        //Objects类下的equals方法 若对象地址相同或者 对象调用equals方法(动态机制绑定子类重写的equals方法)
        //进行判定得结果相同 则返回真
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);// 系统根据属性自动生成hash值 若属性相同 则生成的哈希值也相同
        // 对应的在table数组中的索引也相同

        //因为这里重写了equals方法和hashcode方法 当属性相同的对象存入table中时 得到的索引相同
        //这时开始比较哈希值是否相同 是否是同一个对象 或者 调用equals方法的返回值是否为真来判定是否
        //if (p.hash == hash &&
        //                ((k = p.key) == key || (key != null && key.equals(k))))
        //将该元素加入链表中去
        //所以当属性相同的对象放入hashset时 不能重复放入
    }
}