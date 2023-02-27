//演示接收用户的输入
// import java.util.Scanner;
// //java.util 是一个包 简单文本扫描器 Scanner 类在其中 使用类必须先引入包
// public class test_2_25 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);//用类创建一个对象 new 创建一个什么样的对象
// 		System.out.print("请输入名字");
// 		String name = scanner.next();//用对象使用相关的方法方法 这个是接收一个字符串
// 		System.out.print("请输入年龄");
// 		int age = scanner.nextInt();
// 		System.out.print("请输入薪资");
// 		double sal = scanner.nextDouble();
// 		System.out.println("人的信息如下");
// 		System.out.println("姓名\t年龄\t薪资\t\n"+ name+"\t"+age+"\t"+sal);
// 	}
// }


import java.util.Scanner;
public class test_2_25 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		System.out.println(a^b);
	}
}
