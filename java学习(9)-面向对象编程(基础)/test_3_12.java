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
// 	//�׳�
// 	public int factorial(int n) {
// 		if(n == 1)
// 			return 1;
// 		else{
// 			return n*factorial(n-1);
// 		}
// 	}

// 	//쳲�������
// 	public int feibo(int n) {
// 		if(n<=2) {
// 			return 1;
// 		} else {
// 			return feibo(n-1) + feibo(n-2);
// 		}
// 	} 
// 	//쳲���������
// 	public void feibo2(int n) {
// 		for(int i = 1;i<=n;i++) {
// 			System.out.print(feibo(i) + " ");
// 		}
// 	}

// 	//���ӳ�������
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

//�Թ����� 
//��1��ʾ�ϰ��� 2��ʾ������ 3��ʾ������
// class T {
// 	public boolean findway(int[][] map,int i,int j,int k,int l) { //ij ��ʾ��ʼλ�� kl��ʾ����
// 		if(map[k][l] == 2) //�ݹ������� �ҵ�����
// 			return true;
// 		else {
// 			if(map[i][j] == 0) {
// 				map[i][j] = 2;//���赱ǰλ�ÿ���
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
// 		//�ö�ά���鴴���Թ�
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




// 		//��ӡ����
// 		for(int i = 0;i<map.length;i++) {
// 			for(int j = 0;j<map[i].length;j++) {
// 				System.out.print(map[i][j] + " ");
// 			}
// 			System.out.println();
// 		}


// 	}
// }