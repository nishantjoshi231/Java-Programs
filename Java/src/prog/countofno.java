package prog;

import java.util.Scanner;

public class countofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
final Scanner scan= new Scanner(System.in);
long num=scan.nextLong();
long count=0;
while(num!=0) {
	num=num/10;
	count++;
}
System.out.println("No of digits:"+count);
	}

}
