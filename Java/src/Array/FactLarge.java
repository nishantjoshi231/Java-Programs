package Array;
import java.util.ArrayList;
public class FactLarge  {
	public ArrayList<Integer> factorial(int num){
		ArrayList<Integer> fact= new ArrayList<>();
		int size, c=0;
		size=1;
	   fact.add(0,1);
	   int val=2;
	   while(val<=num) {
		   for(int i=size-1;i>=0;i--) {
			   int temp=fact.get(i)*val+c;
			   fact.set(i, temp%10);
			   c=temp/10;
			  
			   }
		   while(c!=0) {
			   fact.add(0,c%10);
			   c=c/10;
			   size++; }val++; }
		return fact;
	}			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		FactLarge factorial=new FactLarge();

     arr=factorial.factorial(10000);
        for(int n:arr) {
        	System.out.print(n);
        }
	}
}