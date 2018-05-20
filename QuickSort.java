import java.util.*;
class QuickSort
{   
   
   public static int partition(int arr[],int low,int high)
   {
     int pivot=arr[high];
     int i=low-1;
     int j=0;
     for(j=low;j<high;j++)
     {
     	if(arr[j]<=pivot)
     	{ 
        	i++;
        	int t=arr[j];
     		arr[j]=arr[i];
     		arr[i]=t;
     	}
     }

     int t=arr[i+1];
     arr[i+1]=arr[high];
     arr[high]=t;

     return i+1;
   }

   public static void quicksort(int arr[],int low,int high)
   {
   	  if(low<high)
   	  {
   	  	int pi=partition(arr,low,high);

   	  	quicksort(arr,low,pi-1);
   	  	quicksort(arr,pi+1,high);

   	  }
   
   	  return;
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
		quicksort(arr,0,arr.length-1);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}
}