//�˻ʺ�����
class Math {
	public int[] bahanghou(int arr[],int i,int j) { // i j ��ʾÿ��ÿ��������
		if(i==arr.length) { //
			return arr;
		}
		arr[i] = j;
		boolean flag = true;
		for(int k = 0;k<arr.length;k++) {
			if(i!=k) { //��������

			if((arr[k] == j || arr[k]-j == k -i||arr[k]-j == i-k)) //��� i j ���λ���Ƿ���ȷ
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
			System.out.println("�޽�");
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