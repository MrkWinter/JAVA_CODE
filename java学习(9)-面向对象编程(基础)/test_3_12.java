// class T {
// 	public void test(int n) {
// 		if(n>2) {
// 			test(n-1);
// 		}
// 		System.out.print(n +" ");
// 	}
// }

// public class test_3_12 {
// 	public static void main(String[] args) {
// 		T t1 = new T();
// 		t1.test(9);
// 	}
// }
// class math {
// 	//阶乘
// 	public int factorial(int n) {
// 		if(n == 1)
// 			return 1;
// 		else{
// 			return n*factorial(n-1);
// 		}
// 	}

// 	//斐波那契数
// 	public int feibo(int n) {
// 		if(n<=2) {
// 			return 1;
// 		} else {
// 			return feibo(n-1) + feibo(n-2);
// 		}
// 	} 
// 	//斐波那契数列
// 	public void feibo2(int n) {
// 		for(int i = 1;i<=n;i++) {
// 			System.out.print(feibo(i) + " ");
// 		}
// 	}

// 	//猴子吃桃问题
// 	public int monkey(int n) {
// 		if(n>=1&&n<=10) {
// 			if(n==10)
// 				return 1;
// 			else 
// 				return (monkey(n+1)+1)*2;
// 		} else {
// 			return -1;
// 		}
// 	}

// }


// public class test_3_12 {
// 	public static void main(String[] args) {
// 		 math a = new math();
// 		// System.out.println(a.factorial(4));
// 		// System.out.println(a.feibo(7));
// 		// a.feibo2(9);
// 		 System.out.print(a.monkey(7));
// 	}
// }

//迷宫问题 
//用1表示障碍物 2表示可以走 3表示不能走
// class T {
// 	public boolean findway(int[][] map,int i,int j,int k,int l) { //ij 表示初始位置 kl表示出口
// 		if(map[k][l] == 2) //递归的最后结果 找到出口
// 			return true;
// 		else {
// 			if(map[i][j] == 0) {
// 				map[i][j] = 2;//假设当前位置可走
// 				if(findway(map,i+1,j,k,l)) {
// 					return true;
// 				} else if(findway(map,i,j+1,k,l)) {
// 					return true;
// 				} else if(findway(map,i-1,j,k,l)) {
// 					return true;
// 				} else if(findway(map,i,j-1,k,l)) {
// 					return true;
// 				} else {
// 					map[i][j] = 3;
// 					return false;
// 				}
// 			} else {
// 				return false;
// 			}
// 		}
		
// 	}

// }

// public class test_3_12 {
// 	public static void main(String[] args) {
// 		//用二维数组创建迷宫
// 		int[][] map = new int[8][7];
// 		for(int i = 0;i<map.length;i++) {
// 			for(int j = 0;j<map[i].length;j++) {
// 				if(i==0 || i==7)
// 					map[i][j] = 1;
// 				if(j==0 || j==6)
// 					map[i][j] = 1;
// 			}
// 		}
// 		map[3][1] = 1; map[3][2] = 1;


// 		T find = new T();
// 		find.findway(map,1,1,4,1);




// 		//打印数组
// 		for(int i = 0;i<map.length;i++) {
// 			for(int j = 0;j<map[i].length;j++) {
// 				System.out.print(map[i][j] + " ");
// 			}
// 			System.out.println();
// 		}


// 	}
// }