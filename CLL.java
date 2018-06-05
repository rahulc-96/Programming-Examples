import java.util.*;
 class CLL
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

  public static void display(Node first)
  {
    Node temp=first;

    do
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
    while(temp!=first);
  }

  public static void split(Node first)
  {
    Node fast_ptr=first;
    Node slow_ptr=first;
    do
    {
          fast_ptr=fast_ptr.next.next;
          slow_ptr=slow_ptr.next;
    }while(fast_ptr!=first&&fast_ptr.next!=first&&slow_ptr!=first);

    Node mid=slow_ptr;
     slow_ptr=first;
    int len=1;
    do
    { 

      slow_ptr=slow_ptr.next;
      len++;

    }while(slow_ptr.next!=first);

    Node last=slow_ptr;
    if(len%2!=0)
{ 
   Node head2=mid.next;
   mid.next=head;
   Node head1=first;
   last.next=head2;
   display(head1);
   System.out.println();
   display(head2);
}else
{
  Node temp=first;
  while(temp.next!=mid)
  {
    temp=temp.next;
  }
  temp.next=first;
  Node head2=mid;
  last.next=head2;
  display(first);
   System.out.println();
   display(head2);
}


  }

	public static void main(String[] args)
	{
     CLL obj=new CLL();

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=head;
        obj.display(head);
        System.out.println();
        System.out.println();
        obj.split(head);
    

	}
}
