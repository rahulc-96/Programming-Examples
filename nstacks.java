import java.util.*;
class nstacks
{
	static int top[];
	static int arr[];
	static int next[];
 	static int free;
  
	nstacks(int kn,int n)
	{
		top=new int[kn];
		arr=new int[n];
	    next=new int[n];
        free=0;

        int i=0;

        for(i=0;i<kn;i++)
        {
        	top[i]=-1;
        }

         for(i=0;i<n-1;i++)
         {
         	next[i]=i+1;
         }next[n-1]=-1;

       for(i=0;i<n;i++)
         {
            arr[i]=0;
         }
	}

	public static void push(int item,int sn)
	{
            if(free==-1)
            {
            	System.out.println("OVERFLOW");
            	return;
            }

            int i=free;
            free=next[i];
            next[i]=top[sn];
            top[sn]=i;
            arr[i]=item;
	}

	public static void pop(int sn)
	{
		if(free==0)
		{
			System.out.println("UNDERFLOW");
			return;
		}

		int i=top[sn];
		top[sn]=next[i];
		next[i]=free;
		free=i;

		System.out.println(arr[i]);
		return;
	}

	public static void main(String[] args) 
    {
        // Let us create 3 stacks in an array of size 10
        int k = 3, n = 10;
         
        nstacks ks = new nstacks(k, n);
 
        ks.push(15, 2);
        ks.push(45, 2);
 
        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
 
        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);
 
       ks.pop(2);
       ks.pop(1);
       ks.pop(0);
    }
}