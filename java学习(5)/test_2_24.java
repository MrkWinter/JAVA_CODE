// public class test_2_24 {

// 	public static void main(String[] args) {
// 		System.out.println(10.0/4);//2.5 1.0为double 精度提升
// 		double a = 10 / 4;//2.0 运算后转换成double
// 		System.out.println(a);
// 		System.out.println(-11%3);//a%b 的本质 = a - a / b * b

// 		//++的经典例题
// 		int i = 1;
// 		i = i++; //(1)temp = i , (2)i = i + 1, (3)i = temp
// 		System.out.println(i);//1
// 		int j = 1;
// 		j = ++j;//(1)j = j + 1 (2)temp = j (3)j = temp
// 		System.out.println(j)//2

// 	}
// }


// a&b都成立才成立 与a&&b 不同的是 无论a是否成立 都会执行b
// a|b一个不成立就不成立 与a||b不同的是 无论a是否成立 都会执行b
// public class test_2_24 {
// 	public static void main(String[] args) {
// 	int a = 4;
// 	int b = 9;
// 	if(a<1&&++b<20){ //&&不执行
// 		;
// 	}
// 	System.out.println(b);//9
// 		if(a<1&++b>20) { //&执行
// 		;
// 	}
// 	System.out.println(b);//10

// 	}
// }


//逻辑异或 两个 a ^ b  a和b真假值不同则为true 反之则为false
// public class test_2_24 {
// 	public static void main(String[] args) {
// 		boolean a = (10>1)^(7>4);
// 		System.out.println(a);
// 		//使用复合运算符会进行类型转换
// 		byte b = 3;
// 		b += 3;//等价于 b = (byte)(b+3);  b = b + 3 会报错
// 		System.out.println(b);
// 	}
// }

public class test_2_24 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 8;
		a = a>b?a:b;
		a = a>c?a:c;
		System.out.println("abc中最大值为" + a);
	}
}