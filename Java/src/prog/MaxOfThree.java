
package prog;

import java.util.Scanner;
public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Input the Numbers");
         Scanner scan=new Scanner(System.in);
         int a = scan.nextInt();
         int b= scan.nextInt();
         int c= scan.nextInt();
         int d,e;
         if(a>b) {
        	 d=a;
         }
         else { 
        	 d=b;
     
        }
         if (d>c) {
        	 e=d;
         }
         else {
        	 e=c;
         }
         System.out.println("The Max NO is"+ e);
         
	}
	
	

}
