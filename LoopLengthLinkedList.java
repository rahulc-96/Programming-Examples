import java.util.*;
 class LoopLengthLinkedList
{
	static Node head;

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

  
  public static int countNodes(Node t)
  {
    Node ptr=t;
    int count=0;
    while(ptr.next!=t)
    {
      ptr=ptr.next;
      count++;
    }

    return count+1;
  }
  public static int  looplength()
  {
    Node slow_ptr=head;
    Node fast_ptr=head;

    while(slow_ptr!=null&&fast_ptr.next!=null&&fast_ptr!=null)
    {
          fast_ptr=fast_ptr.next.next;
          slow_ptr=slow_ptr.next;

      if(fast_ptr==slow_ptr)
         return countNodes(slow_ptr);

      
    }

    return 0;

  }
 
   

	public static void main(String[] args)
	{
         LoopLengthLinkedList obj=new LoopLengthLinkedList();

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
         
        
        head.next.next.next.next.next =head.next;
          //display(head);
          System.out.println("The length of the loop is "+obj.looplength());


	}
}
