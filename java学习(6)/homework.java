//���뺯����ϰ ��%�����
// import java.util.Scanner;//����� ��
// public class homework {

// 	public static void main(String[] args) {
// 		Scanner put = new Scanner(System.in); //���ඨ�����
// 		double a = put.nextDouble();//�ö���ʹ�÷���
// 		int b = put.nextInt();//�ö���ʹ�÷���
// 		System.out.println(a%b);//a%b��aΪС��ʱ ��ʽΪ a - a(int)/b * b ���ҽ��Ϊ����ֵ
// 	}
// }

//��������ת��

public class homework {
	public static void main(String[] args) {
		char a = '1';
		String str = a + "2.34";
		double num1 = Double.parseDouble(str);

		//Stringת��Ϊ������������ ��װ���ʹ�� 
		//Integer.parseInt();
		//Float.parseFloat();
		//Byte.parseByte();
		//��
		System.out.println(num1);
	}
}