//this �ؼ�����ϰ

// class Person {
// 	String name;
// 	int age;
// 	public Person(String name,int age) {
// 		this.name = name;
// 		this.age = age;
// 	}
// 	public boolean Compare(Person p) {
// 		if(this.name.equals(p.name)&&this.age == p.age) {  //�ַ����Ƚ���equals()����
// 			return true;
// 		} else {
// 			return false;
// 		}
// 	}
// }

// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		Person p1 = new Person("wang",89);
// 		Person p2 = new Person("wang",19);
// 		System.out.println(p1.Compare(p2)); //��ǰ����p1��p2�Ƚ������Ƿ���ͬ
// 	}
//�������е����ֵ
// }
// class A01 {
// 	public Double max(double[] arr) {
// 		if(arr!=null&&arr.length>0) { //��ֹ����Ϊ�� ���ҷ�ֹ����Ԫ�ظ���Ϊ0
// 			double m = arr[0];
// 			for(int i = 0;i<arr.length;i++) {
// 				m = m>arr[i]?m:arr[i];
// 			}
// 			return m;
// 	    } else {
// 	    	return null; //Double��java��һ������double�ķ�װ�� ���Լ����Ϊ�ɴ�null��double��������
// 	    }
// 	}
// }

// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		double[]  arr = {12.3,56.3,45.6,23.4}; //�����������Ϊnull��ô�� �������Ϊ0��Ԫ����ô��
// 		A01 s1 = new A01();
// 		System.out.println(s1.max(arr));
// 	}
// }
//�ַ��������в����Ƿ��ж�Ӧ�ַ���

// class A02 {
// 	public int find(String findstr,String[] str) {
// 		if(str!=null){
// 			for(int i = 0;i<str.length;i++) {
// 				if(findstr.equals(str[i])){
// 					return i;
// 				}
// 			}
// 			return -1;
// 		} else {
// 			return -1;
// 		}
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		String[] arr = {"wang","li","zhang","zao"};
// 		A02 st1 = new A02();
// 		int ret = st1.find("li",arr);
// 		System.out.println(ret);
// 	}
// }

//��������
// class A03 {
// 	public int[] copyArr(int[] oldArr) {
// 		if(oldArr!=null) {
// 			int[] newArr = new int[oldArr.length];
// 			for(int i = 0;i<oldArr.length;i++) {
// 				newArr[i]  = oldArr[i];
// 			}
// 			return newArr;
// 		} else {
// 			return oldArr;
// 		}
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		int[] oldarr = {1,2,3,4,5};
// 		int[] newarr = new int[5];
// 		A03 s1 = new A03();
// 		newarr = s1.copyArr(oldarr);
// 		for(int i = 0;i<newarr.length;i++) {
// 			System.out.println(newarr[i] + " ");
// 		}

// 	}
// }

//Բ��

// class Circle {
// 	double radius;
// 	public Circle(double radius) {
// 		this.radius = radius;
// 	}
// 	public double area() {
// 		return Math.PI * radius * radius; //PI��Math���е��ֶ�(����) �ӽ��ڦУ�
// 	}
// 	public double length() {
// 		return 2*Math.PI*radius;
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		Circle c1 = new Circle(3);
// 		System.out.println("�����" + c1.area());
// 		System.out.println("�ܳ���" + c1.length());
// 	}
// }

//������
// class Cale {
// 	double num1;
// 	double num2;
// 	public Cale(double num1,double num2) {
// 		this.num1 = num1;
// 		this.num2 = num2;
// 	}
// 	public double add() {
// 		return num1 + num2;
// 	} 
// 	public double sub() {
// 		return num1 - num2;
// 	}
// 	public double mul() {
// 		return num1 * num2;
// 	}
// 	public Double div() {
// 		if(num2 == 0) {
// 			System.out.println("��������Ϊ0");
// 			return null;
// 		} else {
// 			return num1/num2;
// 		}
// 	}
// }
// public class Test_3_15 {
// 	public static void main(String[] args) {
// 		Cale c1 = new Cale(12.0,4.0);
// 		Cale c2 = new Cale(10.0,5.0);
// 		System.out.println(c1.add()+ "\t");
// 		System.out.println(c1.sub()+ "\t");
// 		System.out.println(c2.mul()+ "\t");
// 		System.out.println(c2.div()+ "\t");
// 	}
// }

// public class Test_3_15 {
// 	public static double method(double a,double b) {
// 		return a+b;
// 	}
// 	public static double method(double a,int b) {
// 		return a+b;
// 	}
// 	public static void main(String[] args) {
// 		System.out.println(method(method(10.0,20.0),100));
// 		//���������� + ���� ���ε���ͬһ��������
// 	} 
// }

//���ù�����
// class Employee {
// 	String name;
// 	String sex;
// 	int age;
// 	String position;
// 	int salary;
// 	public Employee(String name,String sex,int age) {
// 		this.name = name;
// 		this.sex = sex;
// 		this.age = age;
// 	}
// 	public Employee(String position,int salary) {
// 		this.position = position;
// 		this.salary = salary;
// 	}
// 	public Employee(String name,String sex,int age,String position,int salary) {
// 		this(name,sex,age); //�������ĸ��� ���ڽ����ݴ�����һ����������
// 		//����������ʱ ���ݵĲ�����˳���Ӧ�������Ͷ�Ӧ ���Ǳ�������Ӧ��
// 		//this�൱�ڶ����� �����Ǵ��µ��ù����������ݴ��� ���ж����ʼ��
// 		this.position = position;
// 		this.salary = salary;
// 	}

// }
// public class Test_3_15 {
// 	public static void main(String[] args) {

// 	}
// }
//���������ϰ
class Circle {
	double radius;
	public Circle() { //Ĭ�Ϲ�����

	}
	public Circle(double radius) { //������ (���췽��)
		this.radius = radius;
	}
	public double findAreas() { //��Բ����ķ���
		return Math.PI*radius*radius;
	}
	public void setradius(double radius) { //�޸Ķ���뾶������ ����ʹ�÷������Ͻ���
		this.radius = radius;
	}
}
class PassObject {
	public void printAreas(Circle c,int times) {
		System.out.println("radius\tArea"); //�����ͷ
		for(int i = 1;i<= times;i++) {  //����i����
			c.setradius(i); //�Ѷ���뾶����Ϊi
			System.out.println((double)i+"\t"+c.findAreas()); //���δ�ӡ��Ӧ����İ뾶����Ӧ��Բ�����
		}
	}
}
public class Test_3_15 {
	public static void main(String[] args) {
		Circle c1 = new Circle(); //����һ��Բ�Ķ��� �����а뾶 ��Բ����ķ���
		PassObject s1 = new PassObject(); //����һ����ӡ����
		s1.printAreas(c1,8); //�ö���������еķ��� ��ӡ1��8�뾶Բ�����
	}
}