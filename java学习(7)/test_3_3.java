import java.util.Scanner;
public class test_3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		jinzita(n);
	}
	public static void jinzita(int n) {
		int i,j;
		for(i = n,j = -1;i > 0;i--,j+=2) {
            for(int a = 1;a <= i;a++)
                System.out.print(" ");
        System.out.print("*");
        if(i == n) {
          	System.out.print("\n");
          	continue;
        }
            for(int b = 1;b <= j;b++)
                System.out.print(" ");
        System.out.println("*");
		}
		           for(int c = 0;c<n+1;c++)
            	System.out.print("* ");
	}
}