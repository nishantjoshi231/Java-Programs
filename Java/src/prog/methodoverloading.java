package prog;
import java.util.Scanner;
public class methodoverloading {
 int add(int x, int y) {
	 
	 return x+y;
 }
int add(int x, int y, int z) {
	
	return x+y+z;
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverloading a= new methodoverloading();
 Scanner scan=new Scanner(System.in);
 int num1=scan.nextInt();
 int num2=scan.nextInt();
 System.out.println(a.add(num1, num2));
 int num=scan.nextInt();
 int num02=scan.nextInt();
 int num3=scan.nextInt();
	System.out.println(a.add(num, num02, num3));
	
	
	}
	

}
