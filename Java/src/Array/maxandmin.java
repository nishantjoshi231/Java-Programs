package Array;

public class maxandmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {2,5,6,9,2,1,3,5,50,0};
int max=a[0];
int min=a[0];
for(int i=0;i<a.length;i++) {
	
		if(max<a[i]) {
			 max=a[i];
		}
	for(int j=0;j<a.length;j++) {
		if(min>a[i]) {
			min=a[i];
		}
	}
	}	
 System.out.println("The max value in array is:" +max );
 System.out.println("The min value in array is:" +min );
	
	}
	}

