
// 数组也是数组类型 放入同类型的数据 为引用类型 数组就是一组数据

// 定义方式 数据类型[] 变量名 = {}   访问元素方式 数组名[] 可以通过数组名.length 得到数组的长度
// public class test_3_8 {
// 	public static void main(String[] args) {
// 		double totalweight = 0;
// 		double[] arry = {1,2,45,45,76,34};
// 		for(int i = 0;i<arry.length;i++) {
// 			totalweight += arry[i];
// 		}
// 		System.out.println("总体重为"+ totalweight + "  "
// 			+"平均体重为" + totalweight/arry.length);
//   }
// }


// 使用方式1 动态初始化

// 数据类型 数组名[] = new 数据类型[大小]

//使用方式2 

//数据类型 数组名[] ; （声明） 数组名 = new 数据类型[大小] 
// import java.util.Scanner;
// public class test_3_8 {
// 	public static void main(String[] args) {
// 		double arry[];  //先声明再初始化
// 		arry = new double[5];
// 		for(int i = 0;i<5;i++) {
// 			System.out.println("请输入第"+ (i+1)+ "个元素的值");
// 			Scanner scanner = new Scanner(System.in);
// 			arry[i] = scanner.nextDouble();
// 		} for(int j = 0;j<5;j++) {
// 			System.out.println("第"+ (j+1)+ "个元素的值为"+ arry[j]);
// 		}
//   }
//  }
// 静态初始化

// 使用方式 

// 数据类型 数组名[] = {};应用于知道初始值直接赋值的情况 较简洁}

// public class test_3_8 {
// 	public static void main(String[] args) {
// 	char arry[] = new char[26];
// 	char a = 'A';
// 	for(int i = 0;a<='Z'&&i<arry.length;a++,i++) {
// 		arry[i] = a;
// 		System.out.print(arry[i]+" ");
//  	 }
// 	}
//  }

// public class test_3_8 {
// 	public static void main(String[] args) {

// 		int arr[] = {2,4,6,8,34,7,64,23};
// 		int max = arr[0];
// 		for(int i = 0;i<arr.length;i++) {
// 			max = max>arr[i]?max:arr[i];
// 		}
// 		System.out.print("数组中最大的数字为" + max);
// 	}
//  }

// 数组开辟后在栈区储存一个地址  地址指向堆区 数组元素存储在堆区中

// 数组赋值时是在栈区中从新开辟空间存储地址

// public class test_3_8 {
// 	public static void main(String[] args) {
// 		int arr[] = {1,3,5,7,8,90};
// 		int arr2[] = arr;//将数组arr的地址赋给arr2 等于在栈区中从新开辟一块空间存放arr相等的diz
// 		 // arr2 和 arr 都是指向同一数组的指针
// 		arr2[0] = 0;
// 		System.out.print(arr[0]);//修改arr2 的值 arr也会改变
// 	}
// }

//数组扩容

// public class test_3_8 {
// 	public static void main(String[] args) {
// 		int[] arr1 = {1,2,3};
// 		int[] arr2 = new int[4];
// 		for(int i = 0 ;i<arr1.length;i++) {
// 			arr2[i] = arr1[i];
// 		}
// 		arr2[arr1.length] = 4;
// 		arr1 = arr2; //指针arr1因为被覆盖 所以自动销毁？
// 		arr2 = null;
// 		for(int i = 0;i<arr1.length;i++) {
// 			System.out.print(arr1[i] +" ");
// 		}
// 	}
// }
// import java.util.Scanner;
// public class test_3_8 {
// 	public static void main(String[] args) {
// 		int[] arr1 = {1,2,3};

// 		Scanner scanner  = new Scanner(System.in);
// 		char option = 'Y';
// 		while(option =='Y') {
// 		int[] arr2 = new int[arr1.length+1];
// 		System.out.println("请输入要添加的元素");
// 		int input = scanner.nextInt(); //接收要输入的元素

// 		for(int i = 0 ;i<arr1.length;i++) {
// 			arr2[i] = arr1[i];
// 		}
// 		arr2[arr1.length] = input;
// 		arr1 = arr2; //指针arr1因为被覆盖 所以自动销毁？
// 		arr2 = null;
// 		System.out.println("是否要继续添加Y/N");
// 		option = scanner.next().charAt(0);

// 	}
// 		for(int i = 0;i<arr1.length;i++) {
// 			System.out.print(arr1[i] +" ");
// 		}
// 	}
// }

import java.util.Scanner;
public class test_3_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr1[] = {1,2,3,4,5};
		char option = 'Y';
		while(option=='Y'&&arr1.length!= 1) {
			int[] arr2 = new int[arr1.length-1];//定义一个长度小1的数组
			for(int i = 0;i<arr2.length;i++) {
				arr2[i] = arr1[i]; 
			}
			arr1=arr2; 
			System.out.print("缩减后的数组为");

			for(int j = 0 ;j<arr1.length;j++) {
				System.out.print(arr1[j]+"  ");
			}
			System.out.print("是否要继续缩减Y/N:");
			option = scanner.next().charAt(0);
		}
		if(arr1.length==1 && option == 'Y') {
			System.out.print("数组不能继续缩减");
		}
	}
}