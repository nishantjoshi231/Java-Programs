package Array;
import java.util.Scanner;
public class Dynamic {
 Dynamic(){
	 int size;
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Enter the size");
	 size=scan.nextInt();
	 System.out.print("Enter the elements");
int[] a= new int[size];
  for(int i=0; i<size; i++) {
	  a[i]=scan.nextInt();
  }
for(int j=0; j<size; j++) {
	System.out.print(a[j]+ " ");
}
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dynamic obj=new Dynamic();
	}

}
