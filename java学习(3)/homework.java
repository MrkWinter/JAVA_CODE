import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		//����n�Ľ׳�
		System.out.println("������һ������");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n + "�Ľ׳�Ϊ��" + powl(n));//�����ĵ���
	}
	public static int powl(int n){ 
       if(n!=1) {
       	return n*powl(n-1);
       }else {
        return 1;
       }		
	}
}
//�����ĵ��þ��ǽ��������ݸ������������� �������н������ֵ ֮���ͷŷ�������ʹ�õ��ڴ�
//���������ؾ���һ�����������ٴζ��壬������ͬ��ʹ��ʱ���ݴ�������Ĳ�ͬʹ�ò�ͬ�ķ���