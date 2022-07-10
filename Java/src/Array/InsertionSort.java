package Array;

public class InsertionSort {
	int size=0;
	public void sort(int[] arr) 
	{int size=0;
		size= arr.length;
		for(int i=1;i<size;i++) {
			int temp=arr[i];
			int j=i-1;
			while( j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int val:arr) {
			System.out.print(val+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {10,20,4,5,1,25,15,12,6};
		InsertionSort s= new InsertionSort();
    
		      s.sort(a);

	}

}
