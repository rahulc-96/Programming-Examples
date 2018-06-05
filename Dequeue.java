import java.util.*;
class Dequeue
{
	static int max=6;
	static int front=0,rear=0,size=0;
	static int arr[]=new int[max];

	public static void insertFront(int x)
	{
		if(size==max)
		{
			System.out.println("OVERFLOW");
			return;
		}

		int temp=front-1;
		while(temp<0)temp=temp+max;
		arr[temp]=x;
		size++;
		front=temp%max;
	}

	public static void insertRear(int x)
	{

		if(size==max)
		{
         System.out.println("OVERFLOW");
         return;
		}

		arr[rear]=x;
		rear=(rear+1)%max;
		size++;
	}

	public static void deleteRear()
	{
		if(size==0)
		{
			System.out.println("UNDERFLOW");
			return;
		}
        
        rear=(rear-1)%max;
        size--;
	}

	public static void deleteFront()
	{
		if(size==0)
		{
			System.out.println("UNDERFLOW");
			return;
		}

        front=(front+1)%max;
        size--;
	}

	public static void display()
	{
		int i=0;
		for(i=front;i!=rear;i=(i+1)%max)
		{
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

	public static void getFront()
	{
		if(size==0)
		{
			System.out.println("EMPTY");
			
		}
		else
		{
			System.out.println(arr[front]);
		}

	}


	public static void getRear()
	{
		if(size==0)
		{
			System.out.println("EMPTY");
			
		}
		else
		{
			System.out.println(arr[rear-1]);
		}

	}

	public static void main(String[] args)
	{
		Dequeue q=new Dequeue();
		q.insertFront(5);
		q.getFront();
		q.insertRear(8);
		q.getRear();
		q.insertFront(7);
		q.getFront();
		q.insertRear(9);
		q.getRear();
		q.display();

	}

}