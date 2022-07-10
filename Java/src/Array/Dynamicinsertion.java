package Array;

public class Dynamicinsertion {
	int[] a;
	int capacity;
	int size;
Dynamicinsertion(int capacity){
	this.capacity= capacity;
	a= new int[capacity];
	size=0;
}
void insertion(int element) {
	if(size==capacity) {
		growarray();
		}
	a[size++]=element;
}
void growarray() {
	int[] temp=new int[2*size];
	for(int i=0; i<size; i++) {
		temp[i]=a[i];
	}
	a=temp;	
	capacity=2*size;
}

int deletion(int index){
	if(index>=size)
	{
		return -1;
	}
	int deletedele= a[index];
	for(int i=index+1; i<size; i++) {
		a[i-1]=a[i];
	}
	size--;
	return deletedele;
	
}


	void display() {
		System.out.println("The array is");
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("The array with full capacity is");
		for(int i=0; i<capacity; i++) {
			System.out.print(a[i]+" ");
		}	
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynamicinsertion obj= new Dynamicinsertion(5);
		obj.insertion(20);
		obj.insertion(40);
		obj.insertion(62);
		obj.insertion(74);
		obj.insertion(80);	
		obj.insertion(90);
		obj.insertion(100);
	    obj.display();
	    System.out.println();
	    System.out.println("The deleted item is"+" "+ obj.deletion(2));
	    obj.display();
	}

}
