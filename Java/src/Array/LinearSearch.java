package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {2,30,45,20,0,1,54,7,9,2};
Scanner scan=new Scanner(System.in);
System.out.println("Enter the No you want to find");
int find=scan.nextInt();
int count=0;
for(int i=0;i<a.length;i++) {
	if(find==a[i]) {
		count++;
		
	}
} System.out.println(count+" "+"Matches Found");

}
	}


