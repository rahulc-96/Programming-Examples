import java.util.*;
class StackasQueue
{
	static Stack<Integer> st1=new Stack<Integer>();
	static Stack<Integer> st2=new Stack<Integer>();

	public static void enqueue(int x)
	{
		st1.push(x);
	}

	public static void dequeue()
	{
		if(st1.empty()&&st2.empty())
		{
			System.out.println("EMPTY UNDERFLOW");
			return;
		}

		if(st2.empty())
		{
			while(!st1.empty())
			{
				int x=st1.pop();
				st2.push(x);
			}
		}

		System.out.println(st2.pop());
	}

	public static void main(String[] args)
	{
		StackasQueue obj=new StackasQueue();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();

	}
}