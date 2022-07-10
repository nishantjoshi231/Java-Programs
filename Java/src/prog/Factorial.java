package prog;

public class Factorial {
	
	public  long fact(int num) {
		
		if(num<=1){
			return 1;
		}
		else {
			long fact=num*fact(num-1);
		return fact;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int no=4;
		for(int i=2;i<=no;i++) {
			fact=fact*i;
		}
		
		
/*Factorial n= new Factorial();
             long Fact = n.fact(25);*/
System.out.println(fact);
	}

}
