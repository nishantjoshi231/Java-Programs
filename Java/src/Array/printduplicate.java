package Array;
import java.util.HashSet;

public class printduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {20,40,2,5,20,5,40,70,40,50,20};

      HashSet<Integer> s= new HashSet<>();
      
      for(int no:a) {
    	  if(s.add(no)==false) {
    		  System.out.print(no+" ");
    		  
    	  }
    		  
    	  
      }
 
	}

}
