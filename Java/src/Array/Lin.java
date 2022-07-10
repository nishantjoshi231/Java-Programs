package Array;

public class Lin {
	
static int unsortedLinearSearch(int arr[], int size, int element)

{

    int index=0;

    for(int i = 0; i < size; i++)

    {

        if(arr[i] == element)

        {

            index = i;

            break;

        }

    }

    return index;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,5,2,7,4,3};
int size= a.length;

       System.out.print( unsortedLinearSearch(a,size,3));              
	}

}
