// switch() �е��������� byte char short int enum String ������double float

// switch() �е��������ͱ����case�������������һ�� �����ǿ����Զ�ת�����бȽϵ�����

// �����Զ���������ת�������� byte 
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

// forѭ���ж�θ���ʼֵ�ķ���Ϊ for(int i = 1,j = 2) ctrl + c ��������

// ѭ����ʼֵ�����ж�����ʼ����� ��Ҫ������һ�� �����м��ö��Ÿ���

// ѭ����������Ҳ�����ж������ Ҫ�ö��Ÿ���
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
//���Ľ�����

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
// 			}//��ո�
// 			for(int k = 1;k <= 2*i-1;k++) {
// 				if(k ==1 || k==2*i-1 || i == n)
// 				System.out.print("*");
// 			else
// 				System.out.print(" ");
// 			}//������
// 			System.out.print("\n");
// 		}
// 	}
// }


//break ����ͨ����ǩָ��Ҫ��ֹ������һ������ �﷨ break ��ǩ ͬgo to���һ�� ������ʹ��
// public class test_3_5 {
// 	public static void main(String[] args) {
// 		label:for(int i = 1;i<=10;i++)
// 			for(int j = 1;j<10;j++) {
// 				if(i==2)
// 					break label;
// 				System.out.print(j+" ");
// 			}
// 	}
// }

//continue ��ͨ����ǩָ���´�ѭ����ʼ�ĵط� ��ǩҪ��ѭ����ǰ�� ͬ��������ʹ�� 
// public class test_3_5 {
// 	public static void main(String[] args) {
// 		lable:
// 		for(int j = 1; j<3;j++) {
// 		 for(int i = 3;i<10;i++) {
// 			if(i== 5)
// 				continue lable;
// 			System.out.println(i);
// 		}
// 	 }
// 	}
// }