import java.util.*;
class RecurBubble
{
	 public static void printArray(int arr[],int n)
	 {
	 	int i=0;
	 	for(i=0;i<n;i++)
	 		System.out.print(arr[i]+" ");
	 	System.out.println();

	 }
   
    public static int bubblesort(int arr[],int n)
    {
         if(n==0)
         	return 1;

         int j=0;
         for(j=0;j<n-1;j++)
         {
         	if(arr[j+1]>=arr[j])
         	{
         		int t=arr[j+1];
         		arr[j+1]=arr[j];
         		arr[j]=t;
         	}

         }

         bubblesort(arr,n-1);
         return 1;
    }

	public static void main(String[] args)
	{
		int arr[]={5,1,3,2};
		System.out.println("The Orginal Array");
		printArray(arr,arr.length);
		bubblesort(arr,arr.length);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}
}