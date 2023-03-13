
// //定义一个猫类
// //使用面向对象的方式解决养猫问题
// class Cat {
// 	String name; //属性 == 成员变量 == field (字段)
// 	int age;
// 	String color;
// }


// //类中的属性可以是基本数据类型 也可以是引用类型(对象/数组/字符串)

// class car {
// 	String name;
// 	double price;
// 	String color;
// 	String[] master;
// }
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		Cat cat1 = new Cat();
// 		//1.new Cat() 创建一只猫
// 		//把创建的一只猫赋给cat1
// 		cat1.name = "小白";
// 		cat1.age = 3;
// 		cat1.color = "白色";
// 		//定义猫的属性
// 		System.out.print("name:"+ cat1.name + " age:"+ cat1.age+  " color:" +cat1.color);
// 		//打印猫的信息
// 	}
// }

//属性如果不赋值 会有默认值 规则和数组一致
// class People {
// 	int age;
// 	String name;
// 	double sal;
// 	boolean ispass;

// }
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		//创建People 对象 真正的对象是堆里面的
// 		People p1 = new People();// p1 是对象名代指对象 而不是对象本体 是对对象的引用 
// 		//一个对象可能有多个对象名 同时指向堆区的空间(对象)
// 		System.out.print(p1.age+" " + p1.name+" " +p1.sal+" "+ p1.ispass);
// 	}
// }

// class Person {
// 	String name;
// 	int age;
// }
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		Person s1 = new Person();
// 		s1.name = "小明";
// 		s1.age = 18;
// 		Person s2 = s1;
// 		s2.name = "小花";
// 		System.out.print(s1.name);
// 	}
// }

// 分析代码

// Person s1 = new Person();
// 1 创建一个对象时 类会加载到方法区 然后根据类中定义的属性在堆区开辟内存存储对象的属性 属性为默认值 然后将开辟内存的地址传给对象名 在栈区存储起来
// 若属性中有字符串类型等引用类型 会在开辟的内存中存储地址 指向方法区的常量池 (字符串类型定义的为字符串常量)
// s1.name = "小明";
// s1.age = 18;
// 2 给对象属性符值时 根据对象名存储的地址 找到对象 修改属性
// Person s2 = s1;
// 3 将 s1赋给s2 让s2指向s1 也就是直接在堆区开辟内存存储地址 该地址指向s1 指向的对象 等于一个对象有两个引用
// s2.name = "小花";
// System.out.print(s1.name);
// 对象名s2 和 s1 都指向同一个对象 s2更改 s1也会更改