import java.util.*;

class PriorityQueue
{
	static Node head=null;
	static class Node
	{
		int priority;
		int data;
		Node next;

		Node(int rank,int item)
	{
       
       priority=rank;
       data=item;
       next=null;
	}

	}

	

	public static void insert(int priority,int item)
	{
		Node n=new Node(priority,item);
		if(head==null)
		{
			head=n;
			return;
		}

		if(n.priority<head.priority)
		{
			n.next=head;
			head=n;
			return;
		}

		Node temp=head;
		while(temp.next!=null&&n.priority<temp.next.priority)
		{
		   
         temp=temp.next;

		}
		   n.next=temp.next;
           temp.next=n;

	}


	public static void getHighestPriority()
	{
		if(head==null)
		{
			System.out.println("Queue Empty");
			return;
		}

		System.out.println(head.data);
		return;
	}

	public static void deleteHighestPriority()
   {
   	if(head==null)
		{
			System.out.println("Queue Empty");
			return;
		}

		head=head.next;
		return;
   }


   

	public static void display()
   {
   	if(head==null)
		{
			System.out.println("Queue Empty");
			return;
		}
        Node ptr=head;
		while(ptr!=null)
		{
          System.out.print(ptr.data+" ");
          ptr=ptr.next;
		}System.out.println();
   }
   

   public static void main(String[] args)
   {
      PriorityQueue q=new PriorityQueue();
      q.insert(1,4);
      q.insert(0,7);
      q.insert(2,6);
      q.insert(3,5);
      q.display();
      q.getHighestPriority();
      q.deleteHighestPriority();
      q.getHighestPriority();
      q.display();
   

   }

}