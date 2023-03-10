// import java.util.Scanner;
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		int arr1[] = new int[]{12,45,67,78,334,356};
// 		int arr2[] = new int[arr1.length+1];
// 		System.out.print("请输入要添加的元素");
// 		Scanner scanner = new Scanner(System.in);
// 		arr2[arr2.length-1] = scanner.nextInt();
// 		for(int i = 0;i<arr1.length;i++) {
// 			arr2[i] = arr1[i];
// 		}
// 		arr1 = arr2;
// 		for(int i = arr1.length-1;arr1[i-1]>arr1[i];i--) {
// 			int temp = arr1[i];
// 			arr1[i] = arr1[i-1];
// 			arr1[i-1] = temp;
// 		}
// 		for(int i = 0;i<arr1.length;i++) {
// 			System.out.print(arr1[i]+" ");
// 		}
// 	}
//  }

//数组中存入随机数

// public class test_3_10 {
// 	public static void main(String[] args) {
// 		int[] arr = new int[10];
// 		for(int i = 0;i<arr.length;i++) { //赋值
// 			arr[i] = (int)(Math.random()*100+1);
// 		}
// 		for(int j = 0;j<arr.length;j++) { //打印
// 			System.out.print(arr[j] + " ");
// 		}
// 	}
// }