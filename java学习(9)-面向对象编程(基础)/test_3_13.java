//��ŵ��

// class Math {
// 	public void move(int n, char a,char b ,char c) {
// 		if(n == 1 ) { //
// 			System.out.println(a + "->" + c );
// 		} else {  //
// 			move(n - 1,a, c , b);
// 			//
// 			System.out.println(a + "->" + c);
// 			//
// 			move(n - 1,b ,a ,c);
// 		}
// 	}
// }

// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Math han = new Math();
// 		han.move(10,'a','b','c');
// 	}
// }

//


//��������
// class Mycalculate {
// 	public int calculate(int num1,int num2) {
// 		return num1+num2;
// 	}
// 	public double calculate(double num1,double num2) {
// 		return num1+num2;
// 	}
// 	public double calculate(double num1,int num2) {
// 		return num1+num2;
// 	}
// 	public int calculate(int num1,int num2,int num3) {
// 		return num1+num2+num3;
// 	}
// }
// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Mycalculate mc = new Mycalculate();
// 		System.out.println(mc.calculate(1,1,1));
// 	}
// }

// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Methods m1 = new Methods();
// 		m1.m(100);
// 		m1.m(10,12);
// 		m1.m("aili");
// 	}
// }
// class Methods {
// 	public void m(int n) {
// 		System.out.println("ƽ�� " + (n*n));
// 	}
// 		public void m(int n1,int n2) {
// 		System.out.println("�������ֵ�ƽ��" + (n1*n2));
// 	}
// 		public void m(String n) {
// 		System.out.println("�ַ���Ϊ " + n);
// 	}
// }	
		
// class Methods {
// 	public int max(int n1,int n2) {
// 		return n1>n2?n1:n2;
// 	}
// 		public double max(double n1,double n2) {
// 		return n1>n2?n1:n2;
// 	}
// 		public double max(double n1,double n2,double n3) {
// 		n1 = n1>n2?n1:n2;
// 		return n1>n3?n1:n3;
// 	}
// }

// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Methods s1 = new Methods();
// 		System.out.println(s1.max(12.2,12.4,56.2));
// 	}
// }

// class Methods {
	//����1 2 3 4 �����ĺ� ��Ӧ����  �������� �����鷳������
	//������ͬ �ɱ������ͬ ��ʹ�ÿɱ����
	//�ɱ�������� ��������...������
	//int...sums ��ʾ���յ��ǿɱ���� �൱����0~n������ ����Ϊint
	//ʹ�ò���ʱ ���Ե���������ʹ�� nums�ɵ�������
// 	public int sum(int...nums) {
// 		int sum = 0;
// 		for(int i = 0;i<nums.length;i++) {
// 			sum+= nums[i];
// 		}
// 		return sum;
// 	}
// }
// public class test_3_13 {
// 	public static void main(String[] args) {
// 		Methods s1 = new Methods();
// 		System.out.println("�ܺ�Ϊ" + s1.sum(1,2,3,4));

// 	}
// }

//�ɱ������ϰ

class Method {
	public String show(String name,double...scores) {
		double totalscore = 0;
		for(int i = 0;i<scores.length;i++) {
			totalscore += scores[i];
		}
		return name+ "��" + scores.length + "�ſε��ܳɼ�Ϊ" + totalscore;
	}
}

public class test_3_13 {
	public static void main(String[] args) {
		Method s1 = new Method();
		System.out.println(s1.show("limg",12,34,46));
	}
}

