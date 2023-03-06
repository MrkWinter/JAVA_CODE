// switch() 中的类型能是 byte char short int enum String 不能是double float

// switch() 中的数据类型必须和case后跟的数据类型一致 或者是可以自动转换进行比较的数据

// 可以自动数据类型转换的数据 byte 
// public class test_3_5 {
// 	public static void main(String[] args) {
// 		char a = 'a';
// 		switch(a)
// 		{
// 		case 97:
// 			System.out.println("hello");
// 			break;
// 		case 'b':
// 			System.out.println("java");
// 			break;
// 		default:
// 			System.out.println("hehe");
// 		}
// 	}
// }

// for循环中多次赋初始值的方法为 for(int i = 1,j = 2) ctrl + c 结束程序

// 循环初始值可以有多条初始化语句 但要求类型一样 并且中间用逗号隔开

// 循环变量迭代也可以有多条语句 要用逗号隔开
// public class test_3_5 {
// 	public static void main(String[] args) {
// 		for(int i = 1,j = 1;i<8;i--) {
// 			System.out.println(j+" ");
// 		}
// 	}
// }
// import java.util.Scanner;
// public class test_3_5 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 	    int n = scanner.nextInt();
// 	    int t = scanner.nextInt();
// 	    System.out.println(Max(n,t));
// 	}
// 	public static int Max(int n,int t) {
// 		int sum = 0;
// 		for(int i = 1;i<n;i++) {

// 			if(i%t==0) {
// 				sum+=i;
// 			}
// 		}
// 		return sum;
// 	}
// }
//空心金字塔

// import java.util.Scanner;
// public class test_3_5 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		int n = scanner.nextInt();
// 		jinzita(n);
// 	}
// 	public static void jinzita(int n) {
// 		for(int i = 1; i<= n;i++) {
// 			for(int j = 1; j<=n-i;j++) {
// 				System.out.print(" ");
// 			}//打空格
// 			for(int k = 1;k <= 2*i-1;k++) {
// 				if(k ==1 || k==2*i-1 || i == n)
// 				System.out.print("*");
// 			else
// 				System.out.print(" ");
// 			}//打主体
// 			System.out.print("\n");
// 		}
// 	}
// }

public class test_3_5 {
	public static void main(String[] args) {
		label:for(int i = 1;i<=10;i++)
			for(int j = 1;j<10;j++) {
				if(i==2)
					break label;
				System.out.print(j+" ");
			}
	}
}