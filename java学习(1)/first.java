//第一个java程序
 class first {

	public static void main(String[] args){
	
		System.out.println("she name is 爱莉希雅 ");
	}
}
//一个源文件最多有一个public类，其他类的个数不限，如果源文件中有一个public类，那么文件名必须以public类的该类名命名
//一个源文件中可以有多个class类，javac编译后会生成相应的多个类的字节码文件，可以将main方法写在非public类中，然后指定运行非
//public类，这样入口方法就是非public 的main方法
class name {
	public static void main(String[] args){
		System.out.println("name");
	}
}

//一个源文件中可以有public类也可以没有 一个源文件中最多只能有一个public类 若有public类 那么文件名必须以public类命名
//一个源文件中可以有多个非public类 该类中也可以写main方法 javac编译后根据类可以生成多个字节码文件 包括非public类和public类
//可以指定运行这些文件 从而进入各种类的方法