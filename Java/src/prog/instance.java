package prog;

public class instance {
	static int c=100;// static variable
int a=10;//instance variable
void fun() {
	instance ref= new instance();
	int b= 20;// local variable
	System.out.println(b+" "+ref.a+" "+instance.c);
	
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
        instance obj= new instance();
        obj.fun();
        
	}

}
