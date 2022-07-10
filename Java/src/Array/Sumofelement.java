package Array;

import java.util.Scanner;

public class Sumofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the no");
Scanner scan= new Scanner(System.in);
int length=10;
int sum=0;
int [] num= new int[length];
for(int i=0; i<=length-1;i++) {
	num[i]=scan.nextInt();
}
scan.close();
for(int j=0; j<=num.length-1;j++) {
	System.out.print(num[j]);
}
//for(int i=0;i<=num.length-1;i++) {
	// sum+=num[i];
	for(int value:num) {
		sum+=value;
	}
	 System.out.println("The sum of elements is:"+ sum);
}

        
	
}

