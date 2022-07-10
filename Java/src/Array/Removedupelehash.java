package Array;
import java.util.HashSet;

public class Removedupelehash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {25,2,5,5,30,25,2,7,2,3,5,25};
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		for(int no:hs) {
			System.out.print(no+" ");
		}
	}

}
