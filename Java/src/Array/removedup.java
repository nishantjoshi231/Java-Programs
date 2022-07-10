package Array;

public class removedup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,5,5,8,8,9,9,10,10,};
int j=0;
System.out.println(a.length);
for(int i=0;i<a.length-1;i++) {
	if(a[i]!=a[i+1]) {
		a[j++]=a[i];
		
	}
}
      a[j]=a[a.length-1];  
for(int i=0;i<j+1;i++) { 
        	System.out.print(a[i]);
        }

	}

}
