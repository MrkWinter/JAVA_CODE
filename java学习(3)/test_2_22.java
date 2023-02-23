public class test_2_22 {
	public static void main(String[] args) {
	byte bit = 1;
	char name ='枫';
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
    double numb2 = 4.2/2;//得到的结果不是2.1 而是接近2.1的值 计算机存储的都是近似值
    //在进行计算后小数比较时，应比较相差的绝对值，是否接近0 来判断是否相等
    if(Math.abs(numb1-numb2)<0.001)
    	System.out.println("相等");
		}
} 