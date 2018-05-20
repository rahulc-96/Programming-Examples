import java.util.*;
class IterSelection
{
	public static void selectionsort(int arr[],int n)	 
    {
    	int i=0,j=0;
    	for(i=0;i<n-1;i++)
    	{
    		for(j=i+1;j<n;j++)
    		{
    			if(arr[j]<=arr[i])
    			{
    				int t=arr[j];
    				arr[j]=arr[i];
    				arr[i]=t;
    			}
    		}
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
		int arr[]={5,1,3,2};
		System.out.println("The Orginal Array");
		printArray(arr,arr.length);
		selectionsort(arr,arr.length);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}

}