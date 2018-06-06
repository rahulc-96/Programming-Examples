import java.util.*;

class QueueAsStack
{
	static Queue<Integer> q1=new LinkedList();
	static Queue<Integer> q2=new LinkedList();

	public static void push(int x)
	{
		q1.add(x);
	}

	public static void pop()
	{
		if(q1.peek()==null)
		{
			System.out.println("UNDERFLOW");
			return;
		}


		while(q1.size()>1)
		{
          int x=q1.poll();
          q2.add(x);
		}

		int res=q1.poll();
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;

		System.out.println(res);
		return;
	}

	public static void main(String[] args)
	{
         
         QueueAsStack st=new QueueAsStack();
         st.push(1);
         st.push(2);
         st.push(3);
        
         st.pop();
         st.pop();
         st.pop();
         st.pop();
	}
}