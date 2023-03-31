package com.mrkwinter.polyarr;
//多态数组 实质就是可以利用向上转型和向下转型的机制 先将父类或子类对象存入以父类为数据类型的
//数组中 利用向上转型或者向下转型 不断访问对象 提高访问对象的效率 提高代码的复用性
public class Poly {
    public static void main(String[] args) {
        Person p1 = new Person("zhao", 18);
        Person s1 = new Student("shun", 20, 90);
        Person s2 = new Student("wang", 19, 100);
        Person w1 = new Worker("shan", 21, 3000);
        Person w2 = new Worker("li", 28, 6000);
        //利用向上转型定义五个对象 可以存入多态数组
        Person[] people = {p1,s1,s2,w1,w2}; //创建多态数组
        for(int i = 0;i<people.length;i++) {
            System.out.println(people[i].say());//利用多态数组 循环访问对象
            //因为编译类型为父类 所以找不到子类中的方法
            //如何访问子类中特有元素？ -- 向下转型
            if(people[i] instanceof Student) {
                Student temp = (Student)people[i];
                System.out.println(temp.show());
            }
            if(people[i] instanceof Worker) {
                Worker temp = (Worker)people[i];
                System.out.println(temp.show());
            }
        }
    }
}
