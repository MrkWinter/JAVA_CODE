//八皇后问题
class Math {
	public int[] bahanghou(int arr[],int i,int j) { // i j 表示每行每列有棋子
		if(i==arr.length) { //
			return arr;
		}
		arr[i] = j;
		boolean flag = true;
		for(int k = 0;k<arr.length;k++) {
			if(i!=k) { //条件不对

			if((arr[k] == j || arr[k]-j == k -i||arr[k]-j == i-k)) //检测 i j 这个位置是否正确
				flag = false;
		    }
		}
		if(j+1<arr.length && flag == false) {
			//
			bahanghou(arr,i,j+1);
			return arr;
		} else if(i+1<=arr.length) {
			//
			bahanghou(arr,i+1,0);
			return arr;
		} else {
			System.out.println("无解");
			return arr;
		}
	}
}

public class homework {
	public static void main(String[] args) {
		int[] arr = new int[8];
		Math s1 = new Math();
		s1.bahanghou(arr,0,0);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}