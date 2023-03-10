// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int[] arr = {1,4,2,6,7,9,6,3,5,7};
// 		//冒泡排序
// 		for(int i = 0;i<arr.length-1;i++) { //每一轮排序将较大的数放在后面 共n-1轮
// 			int k = 0;
// 			for(int j = 0;j<arr.length - i - 1;j++) {  //每一轮比较的次数减1 第一轮比较n-1次
// 				if(arr[j]>arr[j+1]) {
// 					int temp = arr[j];
// 					arr[j] = arr[j + 1];
// 					arr[j+1] = temp;
// 					k = 1;
// 				}
// 			}
// 			if(k == 0) 
// 			break;
// 		}
//     for(int i = 0;i<arr.length;i++) {
//     	System.out.print(arr[i] + " ");
//     }
// 	}
//  }

//查找
// import java.util.Scanner;
// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int index = 0;
// 		Scanner scanner = new Scanner(System.in);
// 		String[] arr = {"zhao","wang","shun","tian"};
// 		System.out.print("请输入要查找的字符串");
// 		String str = scanner.next();
// 		for(int i = 0;i<arr.length;i++) {
// 			if(str.equals(arr[i])) {
// 				System.out.print("找到了,下标为" + i);
// 				index = 1;
// 				break;			
// 			}
// 		}
// 		if(index == 0) {
// 			System.out.print("未找到");
// 		}
// 	}
// }

//遍历整个二维数组

// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
// 		for(int i = 0;i<arr.length;i++) {
// 			for(int j = 0;j<arr[i].length;j++) {
// 				System.out.print(arr[i][j] + " ");
// 				// if((j+1)%arr[i].length==0)
// 				// 	System.out.print("\n");
// 			}
// 			System.out.print("\n");
// 		}
// 	}
// }

//定义列数元素不同的数据

// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int[][] arr = new int[3][];
// 		for(int i = 0;i<arr.length;i++) {
// 			arr[i] = new int[i+1];//将二维数组中三个一维数组的地址 
// 			 //每个指向一块开辟的新空间 未开辟前地址为null
// 		}
// 		for(int i = 0;i<arr.length;i++) {
// 			for(int j = 0;j<arr[i].length;j++) {
// 				arr[i][j] = i;
// 			}
// 		}
// 			for(int i = 0;i<arr.length;i++) {
// 			for(int j = 0;j<arr[i].length;j++) {
// 				System.out.print(arr[i][j]+ " ");
// 			}
// 			System.out.print("\n");
// 		}
// 	}
// }

//杨辉三角
// import java.util.Scanner;
// public class test_3_9 {
// 	public static void main(String[] args) {	
// 		System.out.println("请输入要打印杨辉三角的行数");
// 		Scanner scanner = new Scanner(System.in);
// 		int n = scanner.nextInt();
// 		int[][] arr = new int[n][];//n行的二维数组
// 		for(int i = 0;i<arr.length;i++) {
// 			arr[i] = new int[i+1];//每个一维数组数组开辟空间
// 			for(int j = 0;j<arr[i].length;j++) {
// 				if(j == 0 || j == i) {
// 					arr[i][j] = 1;
// 				} else {
// 					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
// 				}
// 			}
// 		} 
// 		for(int i = 0;i<arr.length;i++) {
// 			for(int j = 0;j<arr[i].length;j++) {
// 				System.out.print(arr[i][j] + "\t");
// 			}
// 			System.out.print("\n");
// 		}
//     }

// }