
// class Person {
// 	String name;
// 	int age;
// 	public void speak() {
// 		System.out.println("我是一个好人");
// 	}
// }
// //解释 类中有方法 也叫成员方法 
// // public 表示方法是公开的
// // void 表示方法返回值为空
// // speak() speak 是方法名 ()是参数列表
// // {} 方法体可以写我们运行的代码

// public class test_3_11 {
// 	public static void main(String[] args) {
// 		Person p1 = new Person();
// 		p1.speak();
// 	}
// }

//在类中定义一个方法计算0——1000 的相加结果
// import java.util.Scanner;
// class cal {
// 	public void cal01() {
// 		int res = 0;
// 		for(int i = 1;i<=1000;i++) {
// 			res +=i;
// 		}
// 		System.out.print("1~1000相加的和为:"+res);
// 	}
// 	public void cal02(int n) {
// 		int res = 0;
// 		for(int i = 1;i<=n;i++) {
// 			res +=i;
// 		}
// 		System.out.print("1~"+ n +"相加的和为:"+res);
// 	}
// 	public int cal03(int a,int b) {
// 		return a+b;
// 	}
// }

// public class test_3_11 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		//System.out.print("请输入一个数");
// 		//int n = scanner.nextInt();
// 		cal c1 = new cal();//用类创建一个对象
// 		//c1.cal01();//用对象调用类中的一个成员方法
// 	    //c1.cal02(n);
// 	    System.out.print(c1.cal03(10,20));
// 	}
// }

//方法调用机制解释
// public cal{
// public int cal03(int a,int b) {
// 		return a+b;
// 	}
// }
// public class test_3_11 {
// public static void main(String[] args) {	
// 	cal c1 = new cal();
// 	int ret = c1.cal03(10,20)
// 	System.out.print(ret);
//   }
// }
//程序开始时 main方法进入栈区
//1 cal c1 = new cal() 执行时 用cal类创建对象 对象储存在堆区
//2 int ret = c1.cal03(10,20) 执行时 调用c1.cal03 方法 该方法压入栈区 并将10 和 20
//传递给方法 （） 中的a 和 b 该方法结束后  该方法出栈 将结果a+b返回到原调用函数的地方
//3 System.out.print(ret); 打印结果
// 总结 

// 当程序执行到方法时 就会开辟一个独立的空间(栈空间)
// 当方法进行完毕后 或者执行到return语句时 就会返回
// 返回到调用方法的地方
// 返回后 继续执行方法后的代码
// 当main函数方(栈)法执行完毕 整个程序就会退出

//方法打印二维数组

// class Mytool {
// 	public void printf(int[][] arr) {
// 		for(int i = 0;i<arr.length;i++) {
// 			for(int j = 0;j<arr[i].length;j++) {
// 				System.out.print(arr[i][j] + "\t");
// 			}
// 			System.out.println();
// 		}
// 	}
// }
// public class test_3_11 {
// 	public static void main(String[] args) {
// 		int[][] arr = {{12,3,4},{775,23,45},{232,578,32}};
// 		Mytool printarr = new Mytool();
// 		printarr.printf(arr);
// 	}

// }

//方法返回多个值的情况
//
// class Cal {
// 	public int[] getsumandsub(int a,int b) {//返回类型为数组
// 		int[] arr = new int[2];//开辟空间 动态内存不会被销毁？
// 		arr[0] = a+b;  //int[] 为整形数组类型 
// 		arr[1] = a-b;
// 		return arr;
// 	}
// }
// public class test_3_11 {
// 	public static void main(String[] args) {
// 		Cal s1 = new Cal();
// 		int[] retarr = s1.getsumandsub(3,5);
// 		System.out.println("和"+ retarr[0]);
// 		System.out.println("差"+ retarr[1]);
// 	}
// }
// 成员方法使用细节

// 返回值相关：
// 一个方法只能返回一个值 （如何返回多个值 ？ ———— 返回数组）
// 返回类型可以是任意类型 包含基本数据类型和引用类型 如数组和对象等
// 如果方法中定义了返回类型   则方法体中最后的执行语句必须是retrun 值  方法返回类型必须和return后的值类型一致或兼容
//方法名 小驼峰定义法 首字母小写 其他单词第一个字母大写 其他小写

// 形参列表相关：
// 一个成员方法可以有0个或多个形参
// 参数类型可以是任意类型 包含基本数据类型和引用类型 如 void printarr(int[][] arr)
// 调用成员方法时实参和形参必须类型一致或兼容 并且个数统一一致

// 方法体相关：
// 方法中可以为输入，输出，循环，运算，分支，方法调用等 但是不能进行方法定义
// 方法定义时不同套娃 这点和c语言函数相同 函数里面不能定义函数

//对象为形式参数的使用

// class Person { //定义Person类
// 	String name;
// 	int age;
// }
// class A {
// 	public String rprint(String n){
// 		return n;
// 	}
// 	public void sayhi() {
// 		System.out.print("hi"+" " + rprint("aili\n"));//同一类中的方法可以直接使用
// 	}
// 	public void modifyPerson(Person p2) { //修改Person类的方法
// 		p2.age = 18;
// 	}
// }
// public class test_3_11 {
// 	public static void main(String[] args) {
// 		//print(10);//静态方法必须调用静态方法？
// 		A p1 = new A();
// 		p1.sayhi();

// 		Person p2 = new Person();
// 		p2.name = "ailixiya";
// 		p2.age = 80;
// 		p1.modifyPerson(p2);//用创建的对象p1 调用类A中定义的方法 修改创建的对象p2的属性值
// 		System.out.print("姓名："+ p2.name+"\n"+ "年龄" + p2.age +"\n");
// 	}
// 	// public static void print(int n) {
// 	// 	System.out.print(n);
// 	// }
// }

//克隆对象
// class Person {
// 	String name;
// 	int age;
// }
// class A { 
// 	public Person collo(Person p1) { //a类中的克隆方法
// 		Person p2 = new Person();
// 		p2.name = p1.name;
// 		p2.age = p1.age;
// 		return p2;
// 	}
// }
//  public class test_3_11{
//  	public static void main(String[] args) {

//  		Person p1 = new Person(); //创建一个对象 然后进行克隆
//  		p1.name = "lihua";
//  		p1.age = 28;
//  		A c1 = new A(); //创建一个对象 调用克隆方法
//  		Person p2 = c1.collo(p1); //用对象调用一个方法 克隆对象p1
//  		System.out.println(p2.name);
//  		System.out.print( p2 == p1 ); //比较是否是一个对象 是返回true 否返回 flase
 
//  	}
//  }