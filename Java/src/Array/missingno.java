package Array;

public class missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,5,7,8,9,9,9,9,9};
int [] temp=new int[a.length];
for(int val:a) {
	temp[val]=1;
}
for(int i=0;i<temp.length;i++) {
	if(temp[i]==0) {
		System.out.print(i+" ");
	}
}
	}

}
