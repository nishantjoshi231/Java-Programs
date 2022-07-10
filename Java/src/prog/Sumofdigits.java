package prog;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the no");
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
int sum=0;
while(num!=0) {
	sum=sum+num%10;
	num=num/10;	
}
  System.out.println("Sum of the digits is:"+sum);
	}

}
