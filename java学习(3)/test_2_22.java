public class test_2_22 {
	public static void main(String[] args) {
	byte bit = 1;
	char name ='��';
	short a = 4;
	int b = 5;
	long c = 6l;
	float e = 3e-1f;
	double f =4e-2;
	boolean g = false;
	System.out.println(bit);
	System.out.println(name);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
    System.out.println("hello"+101);
    double numb1 = 2.1;
    double numb2 = 4.2/2;//�õ��Ľ������2.1 ���ǽӽ�2.1��ֵ ������洢�Ķ��ǽ���ֵ
    //�ڽ��м����С���Ƚ�ʱ��Ӧ�Ƚ����ľ���ֵ���Ƿ�ӽ�0 ���ж��Ƿ����
    if(Math.abs(numb1-numb2)<0.001)
    	System.out.println("���");
		}
} 