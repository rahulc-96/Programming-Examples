import java.util.*;
class DequeueLinkedList
{
	static Node front=null,rear=null;
	static class Node
	{
         int data;
         Node next;
         Node prev;

        Node(int item)
        {
        	data=item;
        	next=null;
        	prev=null;
        }

	}

	public static void insertFront(int x)
	{
		Node n=new Node(x);
		if(front==null&&rear==null)
		{
			front=n;
			rear=n;
			return;
		}

		n.next=front;
		front.prev=n;
		front=n;
	}

	public static void insertRear(int x)
	{
		Node n=new Node(x);
		if(front==null&&rear==null)
		{
			front=n;
			rear=n;
			return;
		}

		n.prev=rear;
		rear.next=n;
		rear=n;
	}

	public static void deleteRear()
	{
		if(front==null&&rear==null)
		{
			System.out.println("UNDERFLOW");
			return;
		}
		else if(front==rear)
		{
			front=null;
			rear=null;
			return;
		}
		else
		{
			rear.prev.next=null;
			rear=rear.prev;
			return;
		}
	}


	public static void deleteFront()
	{
		if(front==null&&rear==null)
		{
			System.out.println("UNDERFLOW");
			return;
		}
		else if(front==rear)
		{
			front=null;
			rear=null;
			return;
		}else
		{
			front.next.prev=null;
			front=front.next;
			return;
		}
	}

	public static void getFront()
	{
		if(front==null)
		{
			System.out.println("EMPTY");
			return;
		}else
		{
			System.out.println(front.data);
			return;
		}
	}


		public static void getRear()
	{
		if(front==null)
		{
			System.out.println("EMPTY");
			return;
		}else
		{
			System.out.println(rear.data);
			return;
		}
	}

	public static void display()
	{   
		if(front!=null)
		{
		Node ptr=front;
		while(ptr!=rear)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;

		}
		System.out.println(ptr.data);
	   }
	   else
	   {
          System.out.println("EMPTY");
	   }
	}
 
 public static void main(String[] args)
	{
		DequeueLinkedList q=new DequeueLinkedList();
		q.insertFront(5);
		q.getFront();
		q.insertRear(8);
		q.getRear();
		q.insertFront(7);
		q.getFront();
		q.insertRear(9);
		q.getRear();
		q.display();
		q.deleteFront();
		q.display();
		q.deleteRear();
		q.display();
		q.deleteRear();
		q.deleteRear();
		q.display();
		q.deleteRear();
		q.display();


	}

}
