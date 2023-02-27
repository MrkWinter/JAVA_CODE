//输入函数练习 及%的理解
// import java.util.Scanner;//引入包 类
// public class homework {

// 	public static void main(String[] args) {
// 		Scanner put = new Scanner(System.in); //用类定义对象
// 		double a = put.nextDouble();//用对象使用方法
// 		int b = put.nextInt();//用对象使用方法
// 		System.out.println(a%b);//a%b当a为小数时 公式为 a - a(int)/b * b 并且结果为近似值
// 	}
// }

//数据类型转换

public class homework {
	public static void main(String[] args) {
		char a = '1';
		String str = a + "2.34";
		double num1 = Double.parseDouble(str);

		//String转换为其他数据类型 包装类的使用 
		//Integer.parseInt();
		//Float.parseFloat();
		//Byte.parseByte();
		//等
		System.out.println(num1);
	}
}