//设计一个猜拳游戏 0 1 2 表示石头剪刀布
//思路
//用do while循环来进行不断游戏
//电脑生成随机数
//玩家输入一个数
//进行对比判断输赢
import java.util.Scanner;
import java.util.Random;

class Guess {
	int numc;
	public void puess() {
		Random r = new Random();
		numc = r.nextInt(3);//返回0 ~2的随机数
	}
	public int compare(int nump) {
		if(numc == nump){
			return 0;//平局 
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
			System.out.println("0石头 1剪刀 2布");
			int gus = scanner.nextInt();
			int fina = s1.compare(gus);
			if(fina == 0){
				System.out.println("平");
			} else if(fina == 1) {
				System.out.println("赢");
				win++;
			} else {
				System.out.println("输");
				fail++;
			}

			System.out.print("是否继续猜拳 0结束 1继续");
			input = scanner.nextInt();
		} while(input!= 0);

		System.out.println("获胜次数："+ win + "失败次数：" + fail);
	}
}