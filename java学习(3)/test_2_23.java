public class test_2_23 {
	//��дһ��main����
	public static void main(String[] agrs) {
	char a = 'a';
	char b = 97;//���Խ����ָ����ַ��ͱ�������ʾascill���Ӧ���ַ�
	System.out.println(b);//a
	System.out.println(a);//a
	System.out.println((int)a);//97
	System.out.println('a'+ 10);//107 �ַ������ݿ���������ֵΪ��Ӧ��ascill��ֵ��
    //����һ���������� ռһ���ֽ�
    boolean ispass = false;
    if(!ispass) {
   	 System.out.println("ͨ��");
    }else {
   	 System.out.println("δͨ��");
   }
   double c = 30 + 2.1f;
   System.out.println(c);//32.1; 
   //����ֵ��byte short char ������ֵʱ �����ж��Ƿ��ڷ�Χ�� �������ֵ 
   //�����򱨴�
   byte d = 10;
   System.out.println(d);//10

   //byte short char �ɽ������� ���Զ�ת����int����
   byte a1 = 1;
   short a2 = 2;
   //short b2 = a1 + a2; //a1+a1 ת����int error
   //System.out.println(b2);

   //�Զ�����ԭ�� ���ʽ����������Զ�����Ϊ����������󾫶ȵ�����
   int c1 = 1;
   short c2 = 2;
   float c3 = 3.4f;
   System.out.println(c1+c2+c3);
   }
}