package prog;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter The String");
		Scanner scan= new Scanner(System.in);
        String Str=scan.nextLine();
        /*String rev="";
        int len= Str.length();

        for(int i=len-1; i>=0; i--) {
        	 rev= rev+Str.charAt(i);
        	}
        	*/
        
        //using character array.
        
       /* char [] a= Str.toCharArray();
        int len= a.length;
      String rev="";
        for(int i=len-1; i>=0; i--) {
        	rev=rev+a[i];
        }
        */
        
        
        //using string buffer class
        
        StringBuffer sb=new StringBuffer();
        sb.append(Str);
        StringBuffer rev=sb.reverse();
		System.out.println("the reverse is:"+rev );
	}
	
}
