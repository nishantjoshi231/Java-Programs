package Array;



public class dupsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,5,5,7,8,8,9,9,10,10};
		int [] temp= new int[a.length];  
		int j=0;
           int size= a.length;
           System.out.println(size);
           for(int i=0; i<size-1; i++) {
        	   if(a[i] != a[i+1]) {
        	        temp[j]=a[i];
        	        j++;	   
        	   }
        	 } 
           temp[j]=a[a.length-1];
           for(int i=0; i<a.length;i++) {
        	   System.out.print(temp[i]);
           }
	} 
	
	}


