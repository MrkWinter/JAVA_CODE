//���һ����ȭ��Ϸ 0 1 2 ��ʾʯͷ������
//˼·
//��do whileѭ�������в�����Ϸ
//�������������
//�������һ����
//���жԱ��ж���Ӯ
import java.util.Scanner;
import java.util.Random;

class Guess {
	int numc;
	public void puess() {
		Random r = new Random();
		numc = r.nextInt(3);//����0 ~2�������
	}
	public int compare(int nump) {
		if(numc == nump){
			return 0;//ƽ�� 
		} else if(numc-nump==-1||numc-nump == 2) {
			return -1;
		} else {
			return 1;
		}
	}
}
public class homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int win = 0;
		int fail = 0;
		int input;
		Guess s1 = new Guess();
		do {
			
			s1.puess();
			System.out.println("0ʯͷ 1���� 2��");
			int gus = scanner.nextInt();
			int fina = s1.compare(gus);
			if(fina == 0){
				System.out.println("ƽ");
			} else if(fina == 1) {
				System.out.println("Ӯ");
				win++;
			} else {
				System.out.println("��");
				fail++;
			}

			System.out.print("�Ƿ������ȭ 0���� 1����");
			input = scanner.nextInt();
		} while(input!= 0);

		System.out.println("��ʤ������"+ win + "ʧ�ܴ�����" + fail);
	}
}