// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int[] arr = {1,4,2,6,7,9,6,3,5,7};
// 		//ð������
// 		for(int i = 0;i<arr.length-1;i++) { //ÿһ�����򽫽ϴ�������ں��� ��n-1��
// 			int k = 0;
// 			for(int j = 0;j<arr.length - i - 1;j++) {  //ÿһ�ֱȽϵĴ�����1 ��һ�ֱȽ�n-1��
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

//����
// import java.util.Scanner;
// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int index = 0;
// 		Scanner scanner = new Scanner(System.in);
// 		String[] arr = {"zhao","wang","shun","tian"};
// 		System.out.print("������Ҫ���ҵ��ַ���");
// 		String str = scanner.next();
// 		for(int i = 0;i<arr.length;i++) {
// 			if(str.equals(arr[i])) {
// 				System.out.print("�ҵ���,�±�Ϊ" + i);
// 				index = 1;
// 				break;			
// 			}
// 		}
// 		if(index == 0) {
// 			System.out.print("δ�ҵ�");
// 		}
// 	}
// }

//����������ά����

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

//��������Ԫ�ز�ͬ������

// public class test_3_9 {
// 	public static void main(String[] args) {
// 		int[][] arr = new int[3][];
// 		for(int i = 0;i<arr.length;i++) {
// 			arr[i] = new int[i+1];//����ά����������һά����ĵ�ַ 
// 			 //ÿ��ָ��һ�鿪�ٵ��¿ռ� δ����ǰ��ַΪnull
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

//�������
// import java.util.Scanner;
// public class test_3_9 {
// 	public static void main(String[] args) {	
// 		System.out.println("������Ҫ��ӡ������ǵ�����");
// 		Scanner scanner = new Scanner(System.in);
// 		int n = scanner.nextInt();
// 		int[][] arr = new int[n][];//n�еĶ�ά����
// 		for(int i = 0;i<arr.length;i++) {
// 			arr[i] = new int[i+1];//ÿ��һά�������鿪�ٿռ�
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