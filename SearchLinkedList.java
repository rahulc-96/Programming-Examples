import java.util.*;
 class SearchLinkedList
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

 public static int search(int x)
 {
   int pos=0;
   Node ptr=head;
   while(ptr!=null)
   {
     if(ptr.data==x)
      return pos;
    else
    {
       pos++;
       ptr=ptr.next;
    }
   }
   if(ptr==null)
    return -1;

  return -1;

 }

	public static void main(String[] args)
	{
          SearchLinkedList obj=new SearchLinkedList();

          obj.push(1);
          obj.insertlast(3);
          obj.insertlast(4);
          obj.insertAfter(head,2);
          int k=obj.recursearch(head,2,0);
          if(k==-1)
          System.out.println("No such element exists");
          else
          System.out.println("The searched element is at "+k);
          display(head);
	}
}