package prog;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter the Starting two no's:");
Scanner scan=new Scanner(System.in);
long n1= scan.nextLong();
long n2= scan.nextLong();
long n3=0;
System.out.println("Enter the no of terms in the series");
int no=scan.nextInt();
int count=0;
System.out.print(n1+" "+n2+" ");
while(count<=no) {
	n3=n1+n2;
	System.out.print(n3+" ");
	n1=n2;
	n2=n3;
	count++;
}

	}

}
