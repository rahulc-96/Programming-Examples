import java.util.*;
 class Pallindrome
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

  public static boolean pallindrome()
  {
    Stack<Integer> st=new Stack<Integer>();
    Node ptr=head;
    while(ptr!=null)
    {
      st.push(ptr.data);
      ptr=ptr.next;
    }

    ptr=head;
    while(!st.empty())
   {
     int k=(int)st.pop();
     if(k!=ptr.data)
      return false;
    else
      ptr=ptr.next;
   }


  return true;

  }

   

	public static void main(String[] args)
	{
     Pallindrome obj=new Pallindrome();

        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        
         
        
        
          System.out.println("Pallindrome: "+obj.pallindrome());


	}
}
