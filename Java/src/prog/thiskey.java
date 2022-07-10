package prog;

public class thiskey {
	thiskey(){
		this(20,60);// calling parameterized constructor.
		System.out.println("Learning this Keyword");
	}
   thiskey(int a, int b){
	   //this(); //calling default constructor.
	 System.out.println(a + b);	   
   }
	
  int sub(int a, int b){
	   return a-b;
   }
	public static  void main(String[] args) {
		
    thiskey key=new thiskey();
    //new thiskey(20,40); 
      int sub1=key.sub(100,50);
        System.out.print(sub1);
	}

}
