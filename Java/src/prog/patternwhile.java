package prog;
import java.util.Scanner;
public class patternwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var =new Scanner(System.in);
		System.out.print("Please enter the no of ROWS");
		int b=var.nextInt();
		
		int a=1;
		int count=1;
		while(count <= b)
		{
			int number=1;
		while(number<=count)
		{
		System.out.print(a+" ");
		number++;
		a++;
		}
		System.out.println();
		//System.out.println(count);
		count++;
		}
	}

}
