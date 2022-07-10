package prog;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=20;
System.out.println("The values before swaping :"+a+" "+b);
      /* method 1 
        int c=b;
              b=a;
               a=c; */
          
         /* method 2
             a=a+b;
             b=a-b;
             a=a-b;
                    */

       /*method 3    
          a=a*b;
          b=a/b;
          a=a/b;     */

        /*method 4   
          a=a^b;
          b=a^b;
          a=a^b;  */
                 
      //method 5//

        b=a+b-(a=b);
System.out.println("The values after swaping:"+a+" "+b);
	}

}
