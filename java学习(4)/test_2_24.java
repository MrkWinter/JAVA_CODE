// public class test_2_24 {

// 	public static void main(String[] agrs) {
// // 		// 强制数据类型转换
// // //将容量大的数据类型转换成数据小的数据类型
// // 		//精度丢失
// // 		int n1 = (int)1.9;
// // 		System.out.println(n1);
// // 		//数据溢出
// // 		int n2 = 2000;
// // 		byte n3 = (byte)n2;
// // 		System.out.println("n3 = " + n3);

// 		// //强转符号只对最近的操作数有效
//   //      int a = (int)(3 + 8.2 + 4);
//   //      System.out.println("a = " + a);

// 		//char类型可以保存int的常量值 但不能保存int的变量值
// 		int a1 = 97;
// 		char a2 = (char)a1
// 		System.out.println("a2 = " + a2);

// 	}
// }

// public class test_2_24 {
//  	public static void main(String[] args) {

//     //基本数据类型和String类型的转换
//  		// 基本数据类型的转换成字符串方法 基本数据类型+ “”；
//  		int a1 = 3;
//  		double a2 = 4.5;
//  		String s1 =a1 + "";
//  		String s2 =a2 + "";
//  	    System.out.println(s1);
//  	    System.out.println(s2);

//  	//字符串转换成基本数据类型的方法 使用基本数据类型的包装类相应的方法，得到基本数据类型
//  	String s3 = "1234";
//  	int b1 = Integer.parseInt(s3);
//  	Double b2 = Double.parseDouble(s3);
//     long b3 = Long.parseLong(s3);
//     System.out.println(b1);
//     System.out.println(b2);
//     System.out.println(b3);
//     System.out.println(s3.charAt(0));

//  	}
// }

//homework
public class test_2_24 {
	public static void main(String[] agrs) {
	char c1 = '\n';
	char c2 = '\t';
	char c3 = '\r';
	char c4 = '\\';
	char c5 = '1';
	char c6 = '2';
	char c7 = '3';
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	System.out.println(c7);
	char  a = '男';
	char b = '女';
	System.out.println(""+ a+ b);//字符相加 码值相加 所以加上一个空的字符串 输出男女
	//输出的内容中含有字符串 则会转换成字符串 运算顺序从左到右
	System.out.println(a+ b + "");//码值
	}

}