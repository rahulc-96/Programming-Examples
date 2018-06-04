import java.util.*;
 class NthNodeLinkedList
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
   

  public static int findnthnode(int n)
  {
        int len=length(head);
        int pos=len-n+1;
        int i=1;
        Node ptr=head;
        while(i<pos)
        {
           i++;
           ptr=ptr.next;
        }

        return ptr.data;
  }

  public static int length(Node ptr)
  {
    int count=0;
    while(ptr!=null)
    {
      count++;
      ptr=ptr.next;
    }

    return count;
  }

	public static void main(String[] args)
	{
         NthNodeLinkedList obj=new NthNodeLinkedList();

          obj.push(1);
          obj.insertlast(3);
          obj.insertlast(4);
          obj.insertAfter(head,2);
          display(head);
          System.out.println("The 1st node from end "+obj.findnthnode(1));


	}
}