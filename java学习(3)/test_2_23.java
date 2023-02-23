public class test_2_23 {
	//编写一个main方法
	public static void main(String[] agrs) {
	char a = 'a';
	char b = 97;//可以将数字赋给字符型变量，表示ascill码对应的字符
	System.out.println(b);//a
	System.out.println(a);//a
	System.out.println((int)a);//97
	System.out.println('a'+ 10);//107 字符型数据可以运算其值为对应的ascill码值，
    //定义一个布尔变量 占一个字节
    boolean ispass = false;
    if(!ispass) {
   	 System.out.println("通过");
    }else {
   	 System.out.println("未通过");
   }
   double c = 30 + 2.1f;
   System.out.println(c);//32.1; 
   //当赋值给byte short char 具体数值时 会先判断是否在范围内 如果在则赋值 
   //不在则报错
   byte d = 10;
   System.out.println(d);//10

   //byte short char 可进行运算 但自动转换成int类型
   byte a1 = 1;
   short a2 = 2;
   //short b2 = a1 + a2; //a1+a1 转换成int error
   //System.out.println(b2);

   //自动提升原则 表达式结果的类型自动提升为操作数中最大精度的类型
   int c1 = 1;
   short c2 = 2;
   float c3 = 3.4f;
   System.out.println(c1+c2+c3);
   }
}