package prog;

 import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* approch 1 using Random class
		
		Random rand=new Random();
		int rand_no= rand.nextInt(1000, 10000);
		*/
		
		// approch 2 using math class
		
		int rand_no= (int) (Math.random()*10000);// will generat random no btw 0.0 to 1.0 , hence using typecasting to extract integer values
		
		System.out.print(rand_no);
	}

}
