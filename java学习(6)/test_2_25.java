//��ʾ�����û�������
// import java.util.Scanner;
// //java.util ��һ���� ���ı�ɨ���� Scanner �������� ʹ��������������
// public class test_2_25 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);//���ഴ��һ������ new ����һ��ʲô���Ķ���
// 		System.out.print("����������");
// 		String name = scanner.next();//�ö���ʹ����صķ������� ����ǽ���һ���ַ���
// 		System.out.print("����������");
// 		int age = scanner.nextInt();
// 		System.out.print("������н��");
// 		double sal = scanner.nextDouble();
// 		System.out.println("�˵���Ϣ����");
// 		System.out.println("����\t����\tн��\t\n"+ name+"\t"+age+"\t"+sal);
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
