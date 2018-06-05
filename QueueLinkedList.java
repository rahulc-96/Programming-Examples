import java.util.*;
class QueueLinkedList
{

    static Node rear=null,front=null;
	static class Node
	{
		int data;
		Node next;

		Node(int item)
		{
           data=item;
           next=null;
		}
	}

	public static void enqueue(int x)
	{
      Node n=new Node(x);
     if(front==null&&rear==null)
     {
     	front=n;
     	rear=n;
     }

     rear.next=n;
     rear=n;
	}

	public static Node dequeue()
	{
		if(front==null && rear==null)
		{
			System.out.println("UNDERFLOW");
			return null;
		}

		if(front==rear)
		{
			Node  t=front;
			front=null;
			rear=null;
			return t;
		}

		Node temp=front;
		front=front.next;

		return temp;

	}

	public static void display()
	{
		Node ptr=front;
		if(front==null&&rear==null)
			{ System.out.println("EMPTY");
		      return;
		    }
		    else
		    {
		while(ptr!=rear)
		{

			System.out.print(ptr.data+" ");
			ptr=ptr.next;

		}

	     	System.out.println(rear.data);
	       }
	}

	public static void main(String[] args) 
    {
        QueueLinkedList q=new QueueLinkedList();
        q.enqueue(10);
        q.display();
        q.enqueue(20);
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(30);
        q.display();
        q.enqueue(40);
        q.display();
        q.enqueue(50);
        q.display();  
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
    }
}