package Array;

public class bubblesort {
	public static void Bubble(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[i]) {
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		for(int val:array) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {5,2,3,7,10,20,25,2,4,3,36,15};
      Bubble(a);
	}

}
