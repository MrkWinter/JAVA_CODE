// class Person {
// 	String name; //�ȶ������� ������ֻ�ǽ�ֵ��ݵĳ�ʼ����Щ����
// 	int age;
// 	public Person(String pname,int page) {
// 		name = pname;
// 		age = page;
// 	}
// 	public Person(String pname) {
// 		System.out.println("������������");
// 		name = pname;
// 	}
// }

// public class Test_3_14 {
// 	public static void main(String[] args) {
// 		Person p1 = new Person("name",29);
// 		Person p2 = new Person("name");
// 	}
// } 

// class Person{
// 	int age = 90;
// 	String name;
// 	Person(String n,int a) {
// 		name = n;
// 		age = a;
// 	}
// }
// public class Test_3_14 {
// 	public static void main(String[] args) {
// 		Person p = new Person("xiao",20);
// 		//new����ʱ Person����ȼ��ص������� Ȼ�����ڶ��������ڴ� 
// 		//�ڴ�����age name������ Ĭ�ϳ�ʼ��ֵ�ֱ�Ϊ0��null
// 		//Person���е�age��������ʽ��ʼ�� age��ֵ�����90
// 		//��������ù����� ��"xiao" �� 20 �ֱ𴫵ݵ�n �� a�� �ٸ������е�����name��age
// 		//����name��ֵʱ "xiao" ���ڴ濪���ڷ������ĳ������� ���ڶ����е�name�洢"xiao"�ĵ�ַ
// 		//age���¸�ֵ��20
// 		//���� new���ٵĶ����ʼ����� 
// 		//Ȼ������ջ���п��ٿռ� �洢�������ڴ�ĵ�ַ p�ǵ�ַ �Ƕ�������� �����Ƕ���
// 	}
// } 

class Person{
	int age = 90;
	String name;
	Person() {
		this("na",2); //������������ͬ ���������ܵ��ù�����
		System.out.println("123"); //thisʹ�ù����� �ù������е�һ��this���ʵ�����һ��������
	}
	Person(String n,int a) {
		name = n;
		age = a;
	}
}
public class Test_3_14 {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.age);
	}
} 