// public class test_2_24 {

// 	public static void main(String[] args) {
// 		System.out.println(10.0/4);//2.5 1.0Ϊdouble ��������
// 		double a = 10 / 4;//2.0 �����ת����double
// 		System.out.println(a);
// 		System.out.println(-11%3);//a%b �ı��� = a - a / b * b

// 		//++�ľ�������
// 		int i = 1;
// 		i = i++; //(1)temp = i , (2)i = i + 1, (3)i = temp
// 		System.out.println(i);//1
// 		int j = 1;
// 		j = ++j;//(1)j = j + 1 (2)temp = j (3)j = temp
// 		System.out.println(j)//2

// 	}
// }


// a&b�������ų��� ��a&&b ��ͬ���� ����a�Ƿ���� ����ִ��b
// a|bһ���������Ͳ����� ��a||b��ͬ���� ����a�Ƿ���� ����ִ��b
// public class test_2_24 {
// 	public static void main(String[] args) {
// 	int a = 4;
// 	int b = 9;
// 	if(a<1&&++b<20){ //&&��ִ��
// 		;
// 	}
// 	System.out.println(b);//9
// 		if(a<1&++b>20) { //&ִ��
// 		;
// 	}
// 	System.out.println(b);//10

// 	}
// }


//�߼���� ���� a ^ b  a��b���ֵ��ͬ��Ϊtrue ��֮��Ϊfalse
// public class test_2_24 {
// 	public static void main(String[] args) {
// 		boolean a = (10>1)^(7>4);
// 		System.out.println(a);
// 		//ʹ�ø�����������������ת��
// 		byte b = 3;
// 		b += 3;//�ȼ��� b = (byte)(b+3);  b = b + 3 �ᱨ��
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
		System.out.println("abc�����ֵΪ" + a);
	}
}