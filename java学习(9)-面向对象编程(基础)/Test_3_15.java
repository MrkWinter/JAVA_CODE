//this 关键词练习

// class Person {
// 	String name;
// 	int age;
// 	public Person(String name,int age) {
// 		this.name = name;
// 		this.age = age;
// 	}
// 	public boolean Compare(Person p) {
// 		if(this.name.equals(p.name)&&this.age == p.age) {  //字符串比较用equals()方法
// 			return true;
// 		} else {
// 			return false;
// 		}
// 	}
// }

// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		Person p1 = new Person("wang",89);
// 		Person p2 = new Person("wang",19);
// 		System.out.println(p1.Compare(p2)); //当前对象p1和p2比较名字是否相同
// 	}
//求数组中的最大值
// }
// class A01 {
// 	public Double max(double[] arr) {
// 		if(arr!=null&&arr.length>0) { //防止数组为空 并且防止数组元素个数为0
// 			double m = arr[0];
// 			for(int i = 0;i<arr.length;i++) {
// 				m = m>arr[i]?m:arr[i];
// 			}
// 			return m;
// 	    } else {
// 	    	return null; //Double是java的一个类是double的封装类 可以简单理解为可传null的double数据类型
// 	    }
// 	}
// }

// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		double[]  arr = {12.3,56.3,45.6,23.4}; //问题如果数组为null怎么办 如果数组为0个元素怎么办
// 		A01 s1 = new A01();
// 		System.out.println(s1.max(arr));
// 	}
// }
//字符串数组中查找是否有对应字符串

// class A02 {
// 	public int find(String findstr,String[] str) {
// 		if(str!=null){
// 			for(int i = 0;i<str.length;i++) {
// 				if(findstr.equals(str[i])){
// 					return i;
// 				}
// 			}
// 			return -1;
// 		} else {
// 			return -1;
// 		}
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		String[] arr = {"wang","li","zhang","zao"};
// 		A02 st1 = new A02();
// 		int ret = st1.find("li",arr);
// 		System.out.println(ret);
// 	}
// }

//拷贝数组
// class A03 {
// 	public int[] copyArr(int[] oldArr) {
// 		if(oldArr!=null) {
// 			int[] newArr = new int[oldArr.length];
// 			for(int i = 0;i<oldArr.length;i++) {
// 				newArr[i]  = oldArr[i];
// 			}
// 			return newArr;
// 		} else {
// 			return oldArr;
// 		}
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		int[] oldarr = {1,2,3,4,5};
// 		int[] newarr = new int[5];
// 		A03 s1 = new A03();
// 		newarr = s1.copyArr(oldarr);
// 		for(int i = 0;i<newarr.length;i++) {
// 			System.out.println(newarr[i] + " ");
// 		}

// 	}
// }

//圆类

// class Circle {
// 	double radius;
// 	public Circle(double radius) {
// 		this.radius = radius;
// 	}
// 	public double area() {
// 		return Math.PI * radius * radius; //PI是Math类中的字段(属性) 接近于π；
// 	}
// 	public double length() {
// 		return 2*Math.PI*radius;
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		Circle c1 = new Circle(3);
// 		System.out.println("面积：" + c1.area());
// 		System.out.println("周长：" + c1.length());
// 	}
// }

//计算类
// class Cale {
// 	double num1;
// 	double num2;
// 	public Cale(double num1,double num2) {
// 		this.num1 = num1;
// 		this.num2 = num2;
// 	}
// 	public double add() {
// 		return num1 + num2;
// 	} 
// 	public double sub() {
// 		return num1 - num2;
// 	}
// 	public double mul() {
// 		return num1 * num2;
// 	}
// 	public Double div() {
// 		if(num2 == 0) {
// 			System.out.println("除数不能为0");
// 			return null;
// 		} else {
// 			return num1/num2;
// 		}
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		Cale c1 = new Cale(12.0,4.0);
// 		Cale c2 = new Cale(10.0,5.0);
// 		System.out.println(c1.add()+ "\t");
// 		System.out.println(c1.sub()+ "\t");
// 		System.out.println(c2.mul()+ "\t");
// 		System.out.println(c2.div()+ "\t");
// 	}
// }

// public class Test_3_15 {
// 	public static double method(double a,double b) {
// 		return a+b;
// 	}
// 	public static double method(double a,int b) {
// 		return a+b;
// 	}
// 	public static void main(String[] args) {
// 		System.out.println(method(method(10.0,20.0),100));
// 		//方法的重载 + 推理 两次调用同一个方法名
// 	} 
// }

//复用构造器
// class Employee {
// 	String name;
// 	String sex;
// 	int age;
// 	String position;
// 	int salary;
// 	public Employee(String name,String sex,int age) {
// 		this.name = name;
// 		this.sex = sex;
// 		this.age = age;
// 	}
// 	public Employee(String position,int salary) {
// 		this.position = position;
// 		this.salary = salary;
// 	}
// 	public Employee(String name,String sex,int age,String position,int salary) {
// 		this(name,sex,age); //构造器的复用 等于将内容传给另一个构造器？
// 		//构造器复用时 传递的参数是顺序对应还是类型对应 还是变量名对应？
// 		//this相当于对象名 这里是从新调用构造器将数据传出 进行对象初始化
// 		this.position = position;
// 		this.salary = salary;
// 	}

// }
// public class Test_3_15 {
// 	public static void main(String[] args) {

// 	}
// }
//对象调用练习
class Circle {
	double radius;
	public Circle() { //默认构造器

	}
	public Circle(double radius) { //构造器 (构造方法)
		this.radius = radius;
	}
	public double findAreas() { //求圆面积的方法
		return Math.PI*radius*radius;
	}
	public void setradius(double radius) { //修改对象半径的属性 这里使用方法更严谨？
		this.radius = radius;
	}
}
class PassObject {
	public void printAreas(Circle c,int times) {
		System.out.println("radius\tArea"); //输出表头
		for(int i = 1;i<= times;i++) {  //遍历i个数
			c.setradius(i); //把对象半径设置为i
			System.out.println((double)i+"\t"+c.findAreas()); //依次打印对应对象的半径及对应的圆的面积
		}
	}
}
public class Test_3_15 {
	public static void main(String[] args) {
		Circle c1 = new Circle(); //创建一个圆的对象 类中有半径 求圆面积的方法
		PassObject s1 = new PassObject(); //创建一个打印对象
		s1.printAreas(c1,8); //用对象调用其中的方法 打印1—8半径圆的面积
	}
}