package Array;

public class Binarysearch {

	static void binarysearch(int [] set, int first, int last, int key) {
		int mid= (first+last)/2;
		while(first<=last) {
			if(set[mid]<key) {
				first=mid+1;
			}
			else if(set[mid]==key) {
				System.out.print("The Key Element is found at"+mid+" index");
				break;
			}
			
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not Found");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,4,7,8,9,10,12};
int last=arr.length-1;
int key=9;
       binarysearch(arr,0,last,key);
           
        
	}

}
