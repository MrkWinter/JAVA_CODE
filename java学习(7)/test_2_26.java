// import java.util.Scanner;
// public class test_2_26 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int a = scanner.nextInt();
// 		String str = "1" + a;
// 		int b = Integer.parseInt(str);
// 		System.out.println(b);// "1a"
// 	}
// }

// import java.util.Scanner;

// public class test_2_26 {
// 	public static void main(String[] args) {
// 		Scanner scanner  =  new Scanner(System.in);
// 		int age = scanner.nextInt();
// 		if(age>18) {
// 			System.out.println("坐牢");
// 		} else {
// 			System.out.println("缓刑");
// 		}
// 	}
// }

import java.util.Scanner;
public class test_2_26 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("请输入两个数：");
		double numb1 = scanner.nextDouble();
		double numb2 = scanner.nextDouble();
		if(numb1>20.0 && numb2>20.0) {
			System.out.println("numb1 + numb2 =" + (numb1 + numb2) );
		} else {
			System.out.println("两个数中最少有一个小于20.0");
		}
	}
}