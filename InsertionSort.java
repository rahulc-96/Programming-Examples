import java.util.*;
class InsertionSort
{   
   
  public static void insertionsort(int [] a)
  {
    int n=a.length;
    int i=0,j=0;
    for(i=1;i<n;i++)
    {
      j=i-1;
      int temp=a[i];
      while(j>=0&&temp<=a[j])
      {
        a[j+1]=a[j];
        j--;
      }
    
    a[j+1]=temp;

    }

  }



	public static void printArray(int arr[],int n)
	 {
	 	int i=0;
	 	for(i=0;i<n;i++)
	 		System.out.print(arr[i]+" ");
	 	System.out.println();

	 }
	 public static void main(String[] args)
	{
		int arr[]={5,1,1,2};
		System.out.println("The Orginal Array");
		printArray(arr,arr.length);
		insertionsort(arr);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}
}