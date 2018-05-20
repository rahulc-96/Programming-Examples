import java.util.*;
class MergeSort
{
   public static int mergesort(int arr[],int l,int r)
   {
   	if(l<r)
   	{
   		int mid=(l+r)/2;
   		mergesort(arr,l,mid);
   		mergesort(arr,mid+1,r);

   		merge(arr,l,mid,r);
   	}
   	 return 1;
   }

   public static void merge(int arr[],int l,int mid,int r)
   {
       int n1=mid-l+1;
       int n2=r-mid;

       int L[]=new int[n1];
       int R[]=new int[n2];

       int i=0,j=0;

       for(i=0;i<n1;i++)
        L[i]=arr[l+i];
       for(j=0;j<n2;j++)
       	R[j]=arr[mid+1+j];

       int k=l;
       i=0;j=0;

       while(i<n1&&j<n2)
       {
       	if(L[i]<=R[j])
       	{
       		arr[k]=L[i];
       		i++;
       		k++;
       	}else
       	{
       		arr[k]=R[j];
       		j++;
       		k++;
       	}
       }

       while(i<n1)
       {
         arr[k]=L[i];
         i++;
         k++;

       }

       while(j<n2)
       {
       	arr[k]=R[j];
       	j++;
       	k++;
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
		mergesort(arr,0,arr.length-1);
		System.out.println("The Sorted Array");
		printArray(arr,arr.length);
	}
}