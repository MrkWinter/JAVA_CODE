
// ����Ҳ���������� ����ͬ���͵����� Ϊ�������� �������һ������

// ���巽ʽ ��������[] ������ = {}   ����Ԫ�ط�ʽ ������[] ����ͨ��������.length �õ�����ĳ���
// public class test_3_8 {
// 	public static void main(String[] args) {
// 		double totalweight = 0;
// 		double[] arry = {1,2,45,45,76,34};
// 		for(int i = 0;i<arry.length;i++) {
// 			totalweight += arry[i];
// 		}
// 		System.out.println("������Ϊ"+ totalweight + "  "
// 			+"ƽ������Ϊ" + totalweight/arry.length);
//   }
// }


// ʹ�÷�ʽ1 ��̬��ʼ��

// �������� ������[] = new ��������[��С]

//ʹ�÷�ʽ2 

//�������� ������[] ; �������� ������ = new ��������[��С] 
// import java.util.Scanner;
// public class test_3_8 {
// 	public static void main(String[] args) {
// 		double arry[];  //�������ٳ�ʼ��
// 		arry = new double[5];
// 		for(int i = 0;i<5;i++) {
// 			System.out.println("�������"+ (i+1)+ "��Ԫ�ص�ֵ");
// 			Scanner scanner = new Scanner(System.in);
// 			arry[i] = scanner.nextDouble();
// 		} for(int j = 0;j<5;j++) {
// 			System.out.println("��"+ (j+1)+ "��Ԫ�ص�ֵΪ"+ arry[j]);
// 		}
//   }
//  }
// ��̬��ʼ��

// ʹ�÷�ʽ 

// �������� ������[] = {};Ӧ����֪����ʼֱֵ�Ӹ�ֵ����� �ϼ��}

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
// 		System.out.print("��������������Ϊ" + max);
// 	}
//  }

// ���鿪�ٺ���ջ������һ����ַ  ��ַָ����� ����Ԫ�ش洢�ڶ�����

// ���鸳ֵʱ����ջ���д��¿��ٿռ�洢��ַ

// public class test_3_8 {
// 	public static void main(String[] args) {
// 		int arr[] = {1,3,5,7,8,90};
// 		int arr2[] = arr;//������arr�ĵ�ַ����arr2 ������ջ���д��¿���һ��ռ���arr��ȵ�diz
// 		 // arr2 �� arr ����ָ��ͬһ�����ָ��
// 		arr2[0] = 0;
// 		System.out.print(arr[0]);//�޸�arr2 ��ֵ arrҲ��ı�
// 	}
// }

//��������

// public class test_3_8 {
// 	public static void main(String[] args) {
// 		int[] arr1 = {1,2,3};
// 		int[] arr2 = new int[4];
// 		for(int i = 0 ;i<arr1.length;i++) {
// 			arr2[i] = arr1[i];
// 		}
// 		arr2[arr1.length] = 4;
// 		arr1 = arr2; //ָ��arr1��Ϊ������ �����Զ����٣�
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
// 		System.out.println("������Ҫ��ӵ�Ԫ��");
// 		int input = scanner.nextInt(); //����Ҫ�����Ԫ��

// 		for(int i = 0 ;i<arr1.length;i++) {
// 			arr2[i] = arr1[i];
// 		}
// 		arr2[arr1.length] = input;
// 		arr1 = arr2; //ָ��arr1��Ϊ������ �����Զ����٣�
// 		arr2 = null;
// 		System.out.println("�Ƿ�Ҫ�������Y/N");
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
			int[] arr2 = new int[arr1.length-1];//����һ������С1������
			for(int i = 0;i<arr2.length;i++) {
				arr2[i] = arr1[i]; 
			}
			arr1=arr2; 
			System.out.print("�����������Ϊ");

			for(int j = 0 ;j<arr1.length;j++) {
				System.out.print(arr1[j]+"  ");
			}
			System.out.print("�Ƿ�Ҫ��������Y/N:");
			option = scanner.next().charAt(0);
		}
		if(arr1.length==1 && option == 'Y') {
			System.out.print("���鲻�ܼ�������");
		}
	}
}