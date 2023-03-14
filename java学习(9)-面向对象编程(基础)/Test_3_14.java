// class Person {
// 	String name; //先定义属性 构造器只是将值便捷的初始化这些属性
// 	int age;
// 	public Person(String pname,int page) {
// 		name = pname;
// 		age = page;
// 	}
// 	public Person(String pname) {
// 		System.out.println("构造器被调用");
// 		name = pname;
// 	}
// }

// public class Test_3_14 {
// 	public static void main(String[] args) {
// 		Person p1 = new Person("name",29);
// 		Person p2 = new Person("name");
// 	}
// } 

// class Person{
// 	int age = 90;
// 	String name;
// 	Person(String n,int a) {
// 		name = n;
// 		age = a;
// 	}
// }
// public class Test_3_14 {
// 	public static void main(String[] args) {
// 		Person p = new Person("xiao",20);
// 		//new对象时 Person类会先加载到方法区 然后再在堆区开辟内存 
// 		//内存中有age name等属性 默认初始化值分别为0和null
// 		//Person类中的age属性有显式初始化 age的值变成了90
// 		//再往后调用构造器 将"xiao" 和 20 分别传递到n 和 a中 再赋给类中的属性name和age
// 		//属性name赋值时 "xiao" 的内存开辟在方法区的常量池中 类在堆区中的name存储"xiao"的地址
// 		//age从新赋值了20
// 		//以上 new开辟的对象初始化完成 
// 		//然后再在栈区中开辟空间 存储堆区类内存的地址 p是地址 是对象的引用 而不是对象
// 	}
// } 

class Person{
	int age = 90;
	String name;
	Person() {
		this("na",2); //这点与对象名不同 对象名不能调用构造器
		System.out.println("123"); //this使用构造器 用构造器中第一行this访问调用另一个构造器
	}
	Person(String n,int a) {
		name = n;
		age = a;
	}
}
public class Test_3_14 {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.age);
	}
} 