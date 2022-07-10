package Array;

public class Selectionsort {
static void selection(int[] array) {
	for(int i=0;i<array.length-1;i++) {
		int index=i;
		for(int j=i+1;j<array.length;j++) {
			if(array[j]<array[index]) {
				index=j;
			}
		}
		int temp=array[index];
		array[index]=array[i];
		array[i]=temp;
	}
	for(int val:array) {
		System.out.print(val+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {20,2,30};
       selection(a);
	}

}