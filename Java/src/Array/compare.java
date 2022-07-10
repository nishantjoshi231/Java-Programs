package Array;

import java.util.Arrays;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] a1= {1,2,3,4,5,};
	int [] a2= {1,2,3,4,5};
	
	boolean status= true;
	// Approach 1
	/*if(a1.length==a2.length) {
	for(int i=0;i<a1.length;i++) {
		if(a1[i]!=a2[i]) {
			status=false;
		}
		
	}
	}
	else {
		status=false;
		}
	if(!status) {
		System.out.println("The Arrays are not Equal");
	}
	else {
		System.out.println("The Arrays are Equal");
	}*/
	
// Approach 2
	
	status=Arrays.equals(a1,a2);
	if(!status) {
		System.out.println("Arrays are not equal");
	}else {
	System.out.println("Arrays are equal");
	}
	}
}
