import java.util.*;
class RecurSelection
{
	 public static void printArray(int arr[],int n)
	 {
	 	int i=0;
	 	for(i=0;i<n;i++)
	 		System.out.print(arr[i]+" ");
	 	System.out.println();

	 }
  

    public static int selectionsort(int arr[],int i,int n)
    {
    	if(i==n-1)
    		return 1;
    	int j=0;
    	for(j=i+1;j<n-1;j++)
    	{
    		if(arr[j]<arr[i])
    		{
    			int t=arr[j];
    			arr[j]=arr[i];
    			arr[i]=t;
    		}
    	}

    	selectionsort(arr,i+1,n);
    	return 1;
    }



	 public static void main(String[] args)
	{
		int arr[]={5,1,3,2};
		System.out.println("The Orginal Array");
		printArray(arr,arr.length);
		selectionsort(arr,0,arr.length);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}
}