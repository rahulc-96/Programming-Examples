import java.util.*;
class RecurInsert
{
	 public static void printArray(int arr[],int n)
	 {
	 	int i=0;
	 	for(i=0;i<n;i++)
	 		System.out.print(arr[i]+" ");
	 	System.out.println();

	 }
   
  public static void insertsort(int [] arr,int n)
  {   int j;
        if(n==arr.length)
            return;

        j=n-1;
        int temp=arr[n];
        while(j>=0&&temp<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        
        arr[j+1]=temp;

        insertsort(arr,n+1);

  }

	public static void main(String[] args)
	{
		int arr[]={5,1,3,2};
		System.out.println("The Orginal Array");
		printArray(arr,arr.length);
		insertsort(arr,1);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}
}