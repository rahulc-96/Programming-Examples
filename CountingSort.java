import java.util.*;
class CountingSort
{
    public static void countingsort(int[] arr)//for sorting numbers between 0and100
    {
    	int output[]=new int[arr.length];
    	int count[]=new int[100]; int n=arr.length;
    	int i=0;
    	for(i=0;i<n;i++)
    	{
          
          count[arr[i]]++;

    	}

    	for(i=1;i<100;i++)
    	{
    		count[i]+=count[i-1];
    	}

    	for(i=0;i<n;i++)
    	{
    		output[count[arr[i]]-1]=arr[i];
    		count[arr[i]]--;
    	}

    	printArray(output,n);

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
		countingsort(arr);
		System.out.println("The Sorted Array");
		
	}

}