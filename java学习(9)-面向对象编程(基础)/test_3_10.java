
// //����һ��è��
// //ʹ���������ķ�ʽ�����è����
// class Cat {
// 	String name; //���� == ��Ա���� == field (�ֶ�)
// 	int age;
// 	String color;
// }


// //���е����Կ����ǻ����������� Ҳ��������������(����/����/�ַ���)

// class car {
// 	String name;
// 	double price;
// 	String color;
// 	String[] master;
// }
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		Cat cat1 = new Cat();
// 		//1.new Cat() ����һֻè
// 		//�Ѵ�����һֻè����cat1
// 		cat1.name = "С��";
// 		cat1.age = 3;
// 		cat1.color = "��ɫ";
// 		//����è������
// 		System.out.print("name:"+ cat1.name + " age:"+ cat1.age+  " color:" +cat1.color);
// 		//��ӡè����Ϣ
// 	}
// }

//�����������ֵ ����Ĭ��ֵ ���������һ��
// class People {
// 	int age;
// 	String name;
// 	double sal;
// 	boolean ispass;

// }
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		//����People ���� �����Ķ����Ƕ������
// 		People p1 = new People();// p1 �Ƕ�������ָ���� �����Ƕ����� �ǶԶ�������� 
// 		//һ����������ж�������� ͬʱָ������Ŀռ�(����)
// 		System.out.print(p1.age+" " + p1.name+" " +p1.sal+" "+ p1.ispass);
// 	}
// }

// class Person {
// 	String name;
// 	int age;
// }
// public class test_3_10 {
// 	public static void main(String[] args) {
// 		Person s1 = new Person();
// 		s1.name = "С��";
// 		s1.age = 18;
// 		Person s2 = s1;
// 		s2.name = "С��";
// 		System.out.print(s1.name);
// 	}
// }

// ��������

// Person s1 = new Person();
// 1 ����һ������ʱ �����ص������� Ȼ��������ж���������ڶ��������ڴ�洢��������� ����ΪĬ��ֵ Ȼ�󽫿����ڴ�ĵ�ַ���������� ��ջ���洢����
// �����������ַ������͵��������� ���ڿ��ٵ��ڴ��д洢��ַ ָ�򷽷����ĳ����� (�ַ������Ͷ����Ϊ�ַ�������)
// s1.name = "С��";
// s1.age = 18;
// 2 ���������Է�ֵʱ ���ݶ������洢�ĵ�ַ �ҵ����� �޸�����
// Person s2 = s1;
// 3 �� s1����s2 ��s2ָ��s1 Ҳ����ֱ���ڶ��������ڴ�洢��ַ �õ�ַָ��s1 ָ��Ķ��� ����һ����������������
// s2.name = "С��";
// System.out.print(s1.name);
// ������s2 �� s1 ��ָ��ͬһ������ s2���� s1Ҳ�����