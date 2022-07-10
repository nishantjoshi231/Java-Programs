package prog;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Scanner scan= new Scanner(System.in);
 System.out.println("Enter the no:");
  int num=scan.nextInt();
 int orignal =num;
int rev=0; 
 while(num!=0) {
	 rev=rev*10+num%10;
	num=num/10;
}
if(orignal==rev) {
	System.out.println("The no is a palindrome");
}else {
	 System.out.println("The no is not a palindrome");
}
}
	}


