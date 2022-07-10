package Array;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner scan= new Scanner(System.in);
		int length=10;
		int [] num= new int[length];
		for(int i=0; i<=length-1;i++) {
			num[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("the even no's are:");
		for(int i=0;i<=length-1;i++) {
			if(num[i]%2==0) {
				System.out.print(num[i]+" ");
			}
	}
		System.out.println();
		System.out.println("the odd no's are:");
		for(int i=0;i<=length-1;i++) {
			if(num[i]%2!=0) {
				System.out.print(num[i]+" ");
			}
	}
		
		
		
	}
	

}
