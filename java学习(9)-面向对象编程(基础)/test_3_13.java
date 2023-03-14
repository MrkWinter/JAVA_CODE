//汉诺塔

// class Math {
// 	public void move(int n, char a,char b ,char c) {
// 		if(n == 1 ) { //
// 			System.out.println(a + "->" + c );
// 		} else {  //
// 			move(n - 1,a, c , b);
// 			//
// 			System.out.println(a + "->" + c);
// 			//
// 			move(n - 1,b ,a ,c);
// 		}
// 	}
// }

// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Math han = new Math();
// 		han.move(10,'a','b','c');
// 	}
// }

//


//方法重载
// class Mycalculate {
// 	public int calculate(int num1,int num2) {
// 		return num1+num2;
// 	}
// 	public double calculate(double num1,double num2) {
// 		return num1+num2;
// 	}
// 	public double calculate(double num1,int num2) {
// 		return num1+num2;
// 	}
// 	public int calculate(int num1,int num2,int num3) {
// 		return num1+num2+num3;
// 	}
// }
// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Mycalculate mc = new Mycalculate();
// 		System.out.println(mc.calculate(1,1,1));
// 	}
// }

// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Methods m1 = new Methods();
// 		m1.m(100);
// 		m1.m(10,12);
// 		m1.m("aili");
// 	}
// }
// class Methods {
// 	public void m(int n) {
// 		System.out.println("平方 " + (n*n));
// 	}
// 		public void m(int n1,int n2) {
// 		System.out.println("两个数字的平方" + (n1*n2));
// 	}
// 		public void m(String n) {
// 		System.out.println("字符串为 " + n);
// 	}
// }	
		
// class Methods {
// 	public int max(int n1,int n2) {
// 		return n1>n2?n1:n2;
// 	}
// 		public double max(double n1,double n2) {
// 		return n1>n2?n1:n2;
// 	}
// 		public double max(double n1,double n2,double n3) {
// 		n1 = n1>n2?n1:n2;
// 		return n1>n3?n1:n3;
// 	}
// }

// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Methods s1 = new Methods();
// 		System.out.println(s1.max(12.2,12.4,56.2));
// 	}
// }

// class Methods {
	//计算1 2 3 4 个数的和 对应方法  方法重载 但较麻烦无意义
	//功能相同 可变参数不同 可使用可变参数
	//可变参数定义 数据类型...变量名
	//int...sums 表示接收的是可变参数 相当于有0~n个参数 类型为int
	//使用参数时 可以当成数组来使用 nums可当成数组
// 	public int sum(int...nums) {
// 		int sum = 0;
// 		for(int i = 0;i<nums.length;i++) {
// 			sum+= nums[i];
// 		}
// 		return sum;
// 	}
// }
// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Methods s1 = new Methods();
// 		System.out.println("总和为" + s1.sum(1,2,3,4));

// 	}
// }

//可变参数练习

class Method {
	public String show(String name,double...scores) {
		double totalscore = 0;
		for(int i = 0;i<scores.length;i++) {
			totalscore += scores[i];
		}
		return name+ "有" + scores.length + "门课的总成绩为" + totalscore;
	}
}

public class test_3_13 {
	public static void main(String[] args) {
		Method s1 = new Method();
		System.out.println(s1.show("limg",12,34,46));
	}
}

