package Array;

public class learnarray{
	
	 int[] a= {10,20,30,40,50};
	 int[] b= new int [5];
	learnarray() {
    b[0]=100;
    b[1]=200;	
    b[2]=300;
    b[3]=400;
    b[4]=500;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        learnarray obj= new learnarray();
		for(int i=0; i<=4; i++) {
	System.out.println(obj.a[i]);
		}
		

	for(int j=0; j<5; j++) {
		System.out.println(obj.b[j]);
	}
	
	
}
	}


