
// class Person {
// 	String name;
// 	int age;
// 	public void speak() {
// 		System.out.println("����һ������");
// 	}
// }
// //���� �����з��� Ҳ�г�Ա���� 
// // public ��ʾ�����ǹ�����
// // void ��ʾ��������ֵΪ��
// // speak() speak �Ƿ����� ()�ǲ����б�
// // {} ���������д�������еĴ���

// public class test_3_11 {
// 	public static void main(String[] args) {
// 		Person p1 = new Person();
// 		p1.speak();
// 	}
// }

//�����ж���һ����������0����1000 ����ӽ��
// import java.util.Scanner;
// class cal {
// 	public void cal01() {
// 		int res = 0;
// 		for(int i = 1;i<=1000;i++) {
// 			res +=i;
// 		}
// 		System.out.print("1~1000��ӵĺ�Ϊ:"+res);
// 	}
// 	public void cal02(int n) {
// 		int res = 0;
// 		for(int i = 1;i<=n;i++) {
// 			res +=i;
// 		}
// 		System.out.print("1~"+ n +"��ӵĺ�Ϊ:"+res);
// 	}
// 	public int cal03(int a,int b) {
// 		return a+b;
// 	}
// }

// public class test_3_11 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		//System.out.print("������һ����");
// 		//int n = scanner.nextInt();
// 		cal c1 = new cal();//���ഴ��һ������
// 		//c1.cal01();//�ö���������е�һ����Ա����
// 	    //c1.cal02(n);
// 	    System.out.print(c1.cal03(10,20));
// 	}
// }

//�������û��ƽ���
// public cal{
// public int cal03(int a,int b) {
// 		return a+b;
// 	}
// }
// public class test_3_11 {
// public static void main(String[] args) {	
// 	cal c1 = new cal();
// 	int ret = c1.cal03(10,20)
// 	System.out.print(ret);
//   }
// }
//����ʼʱ main��������ջ��
//1 cal c1 = new cal() ִ��ʱ ��cal�ഴ������ ���󴢴��ڶ���
//2 int ret = c1.cal03(10,20) ִ��ʱ ����c1.cal03 ���� �÷���ѹ��ջ�� ����10 �� 20
//���ݸ����� ���� �е�a �� b �÷���������  �÷�����ջ �����a+b���ص�ԭ���ú����ĵط�
//3 System.out.print(ret); ��ӡ���
// �ܽ� 

// ������ִ�е�����ʱ �ͻῪ��һ�������Ŀռ�(ջ�ռ�)
// ������������Ϻ� ����ִ�е�return���ʱ �ͻ᷵��
// ���ص����÷����ĵط�
// ���غ� ����ִ�з�����Ĵ���
// ��main������(ջ)��ִ����� ��������ͻ��˳�

//������ӡ��ά����

// class Mytool {
// 	public void printf(int[][] arr) {
// 		for(int i = 0;i<arr.length;i++) {
// 			for(int j = 0;j<arr[i].length;j++) {
// 				System.out.print(arr[i][j] + "\t");
// 			}
// 			System.out.println();
// 		}
// 	}
// }
// public class test_3_11 {
// 	public static void main(String[] args) {
// 		int[][] arr = {{12,3,4},{775,23,45},{232,578,32}};
// 		Mytool printarr = new Mytool();
// 		printarr.printf(arr);
// 	}

// }

//�������ض��ֵ�����
//
// class Cal {
// 	public int[] getsumandsub(int a,int b) {//��������Ϊ����
// 		int[] arr = new int[2];//���ٿռ� ��̬�ڴ治�ᱻ���٣�
// 		arr[0] = a+b;  //int[] Ϊ������������ 
// 		arr[1] = a-b;
// 		return arr;
// 	}
// }
// public class test_3_11 {
// 	public static void main(String[] args) {
// 		Cal s1 = new Cal();
// 		int[] retarr = s1.getsumandsub(3,5);
// 		System.out.println("��"+ retarr[0]);
// 		System.out.println("��"+ retarr[1]);
// 	}
// }
// ��Ա����ʹ��ϸ��

// ����ֵ��أ�
// һ������ֻ�ܷ���һ��ֵ ����η��ض��ֵ �� �������� �������飩
// �������Ϳ������������� ���������������ͺ��������� ������Ͷ����
// ��������ж����˷�������   �򷽷���������ִ����������retrun ֵ  �����������ͱ����return���ֵ����һ�»����
//������ С�շ嶨�巨 ����ĸСд �������ʵ�һ����ĸ��д ����Сд

// �β��б���أ�
// һ����Ա����������0�������β�
// �������Ϳ������������� ���������������ͺ��������� �� void printarr(int[][] arr)
// ���ó�Ա����ʱʵ�κ��βα�������һ�»���� ���Ҹ���ͳһһ��

// ��������أ�
// �����п���Ϊ���룬�����ѭ�������㣬��֧���������õ� ���ǲ��ܽ��з�������
// ��������ʱ��ͬ���� ����c���Ժ�����ͬ �������治�ܶ��庯��

//����Ϊ��ʽ������ʹ��

// class Person { //����Person��
// 	String name;
// 	int age;
// }
// class A {
// 	public String rprint(String n){
// 		return n;
// 	}
// 	public void sayhi() {
// 		System.out.print("hi"+" " + rprint("aili\n"));//ͬһ���еķ�������ֱ��ʹ��
// 	}
// 	public void modifyPerson(Person p2) { //�޸�Person��ķ���
// 		p2.age = 18;
// 	}
// }
// public class test_3_11 {
// 	public static void main(String[] args) {
// 		//print(10);//��̬����������þ�̬������
// 		A p1 = new A();
// 		p1.sayhi();

// 		Person p2 = new Person();
// 		p2.name = "ailixiya";
// 		p2.age = 80;
// 		p1.modifyPerson(p2);//�ô����Ķ���p1 ������A�ж���ķ��� �޸Ĵ����Ķ���p2������ֵ
// 		System.out.print("������"+ p2.name+"\n"+ "����" + p2.age +"\n");
// 	}
// 	// public static void print(int n) {
// 	// 	System.out.print(n);
// 	// }
// }

//��¡����
// class Person {
// 	String name;
// 	int age;
// }
// class A { 
// 	public Person collo(Person p1) { //a���еĿ�¡����
// 		Person p2 = new Person();
// 		p2.name = p1.name;
// 		p2.age = p1.age;
// 		return p2;
// 	}
// }
//  public class test_3_11{
//  	public static void main(String[] args) {

//  		Person p1 = new Person(); //����һ������ Ȼ����п�¡
//  		p1.name = "lihua";
//  		p1.age = 28;
//  		A c1 = new A(); //����һ������ ���ÿ�¡����
//  		Person p2 = c1.collo(p1); //�ö������һ������ ��¡����p1
//  		System.out.println(p2.name);
//  		System.out.print( p2 == p1 ); //�Ƚ��Ƿ���һ������ �Ƿ���true �񷵻� flase
 
//  	}
//  }