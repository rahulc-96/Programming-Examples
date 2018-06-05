import java.util.*;
class QueueArray
{
	
	static int q[]=new int[3];
	static int front=-1;
	static int rear=-1;

    public static boolean isEmpty()
    {
    	if(rear==-1&&front==-1)
    		return true;
    	else
    		return false;
    }
	public static void enqueue(int x)
	{
		if((rear+1)%9==front)
			return;
		else if(isEmpty())
		{
			rear=0;
			front=0;
		}
		else
		{
			rear=(rear+1)%9;
		}

      q[rear]=x;
	}

	public static void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("UNDERFLOW");
			return;
		}
		else if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front=(front+1)%9;
		}
	}

	public static void  display()
	{
		int i=0;
		if(!isEmpty())
		{for(i=front;i<=rear;i++)
		{
			System.out.print(q[i]+" ");
		}System.out.println();
	    }else
	    {
	    System.out.println("EMPTY");
	    }
	}


	public static void main(String[] args)
	{
		QueueArray obj=new QueueArray();
		obj.enqueue(13);
		obj.display();
		obj.enqueue(41);
		obj.display();
		obj.enqueue(25);
		obj.display();
		obj.dequeue();
		obj.display();
		obj.dequeue();
		obj.display();
		obj.dequeue();		
		obj.dequeue();
		obj.enqueue(27);
		obj.display();
		obj.enqueue(29);
		obj.display();
	}

}