import java.util.Scanner;
public class homework {
	public static void main(String[] args) {
		//计算n的阶乘
		System.out.println("请输入一个数：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(n + "的阶乘为：" + powl(n));//方法的调用
	}
	public static int powl(int n){ 
       if(n!=1) {
       	return n*powl(n-1);
       }else {
        return 1;
       }		
	}
}
//方法的调用就是将变量传递给方法进行运算 返回运行结束后的值 之后释放方法调用使用的内存
//方法的重载就是一个方法名可再次定义，参数不同，使用时根据传入参数的不同使用不同的方法