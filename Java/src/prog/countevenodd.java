package prog;

import java.util.Scanner;

public class countevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
Scanner scan=new Scanner(System.in);
long no= scan.nextLong();
int even=0;
int odd=0;
 long temp=0;
while(no!=0) {
	temp= no%10;
	no=no/10;
if(temp%2==0) {
	even++;
}
else {
	odd++;
}
}
    System.out.println("No of odd no in the NO is "+ odd);
    System.out.println("No of even no in the NO is "+ even);
	}

}
