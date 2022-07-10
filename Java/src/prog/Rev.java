package prog;

import java.util.Scanner;

public class Rev {
	long x;
	static final Scanner scan=new Scanner(System.in);
	
	   long rev (Scanner scan){
	System.out.println("Enter the no");
	x= scan.nextLong();
	long num=0;
	while (x!=0) {
		num=num*10+x%10;
		x=x/10;
	}
	return num;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Using algo.
		 * Rev obj=new Rev();
    long Reverse= obj.rev(scan);*/
		
		
		
	/* using StingBuffer.
		Scanner scan= new Scanner(System.in);
	   System.out.println("Enter the no");
	   long num=scan.nextLong();
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer Reverse=sb.reverse();
		*/
		
		
		
		
		// using string builder class.
		Scanner scan= new Scanner(System.in);
		   System.out.println("Enter the no");
		   long num=scan.nextLong();
		StringBuilder sb= new StringBuilder();
		 sb.append(num);
		 StringBuilder Reverse=sb.reverse();
		
    System.out.println("The Reverse is::"+ Reverse);
	}

}
