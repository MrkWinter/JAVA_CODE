package com.mrkwinter.object_2;

//类中从写equals方法
//比较两个Person类对象是否相等
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object ele) { //重写object中的equals方法
        if (this == ele) { //this指调用方法的对象(Person类)  ele 是指传递的对象
            return true;
        }
        if (ele instanceof Person) { //传递的对象属于Person类才能比较
            Person p = (Person) ele; //向下转型访问对象中成员
            return name.equals(p.name) && age == p.age && gender == p.gender;
        } //private修饰的对象 同类中可以访问 同包 子类 不同包不能访问 这里是属于原类中访问？
        //对象若传入不同类 则不能访问 但是在其他用Object超类接收 向上转型后向下转型 还可以调用吗？
        return false;
    }
    //同类中private属性的使用
    public boolean test(Person s1) {
        System.out.println(s1.age);//s1.age; //true 同类中传入同类对象 可以使用private属性
        //也就是同类对象可以在同类中访问成员 即使是外来接收的同类对象
        Object p = s1;//向上转型
        Person t = (Person)s1;
        System.out.println(t.age);
        return true;
    }
}
