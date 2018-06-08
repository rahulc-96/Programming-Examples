import java.util.*;
class StackasLinkedList
{
	static Node top=null;
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


	public static void push(int x)
	{
		Node n=new Node(x);
        if(top==null)
        {
        	top=n;

        }else
        {
        	n.next=top;
        	top=n;
        }
	}

	public static void reverse()
	{
		Node prev=null,cur=top,next=null;

		while(cur!=null)
		{
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}

		top=prev;
	}

	public static void display()
	{
		Node ptr=top;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}

		System.out.println();
	}

	public static void main(String[] args)
	{
		StackasLinkedList st=new StackasLinkedList();
		st.push(1);
		st.push(2);
		st.push(3);

		st.display();

		st.reverse();

		st.display();
	}
}