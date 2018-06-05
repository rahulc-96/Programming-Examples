import java.util.*;
 class FreqLinkedList
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

    public static void push(int item)
    {   Node new_node=new Node(item);
    	if(head==null)
    	{
    		head=new_node;
    		return;
    	}
       
       new_node.next=head;
       head=new_node;

    }


    public static void insertAfter(Node prev,int item)
    {
         if(prev==null)
         {
         System.out.println("Previous Node is NULL");
         return;
         }

         Node new_node=new Node(item);

         new_node.next=prev.next;
         prev.next=new_node;

    }

    public static void insertlast(int item)
    {   
    	Node new_node=new Node(item);
    	Node ptr=head;
    	if(head==null)
    	{
    		head=new_node;
    		return;
    	}
    
       while(ptr.next!=null)
       	ptr=ptr.next;

       ptr.next=new_node;

    }

	public static void display(Node ptr)
	{
		while(ptr.next!=null)
		{
         
          System.out.print(ptr.data+"->"); ptr=ptr.next;
		}
		  System.out.println(ptr.data+"-->NULL");
	}

  public static int frequency(Node ptr,int x)
  {
     if(ptr==null)
     return 0;
     if(ptr.data==x)
      return 1+frequency(ptr.next,x);
    else
      return frequency(ptr.next,x);

  }

   



	public static void main(String[] args)
	{
         FreqLinkedList obj=new FreqLinkedList();

          obj.push(1);
          obj.push(2);
          obj.insertlast(3);
          obj.insertlast(4);
          obj.insertAfter(head,2);
          display(head);
          System.out.println("Frequency="+obj.frequency(head,1));


	}
}
