import java.util.*;
class ReverseStack
{
	
static Stack<Integer> st1=new Stack<Integer>();
static Stack<Integer> st2=new Stack<Integer>();

public static Stack reverse(Stack st1)
{
	if(st1.empty())
		return st2;
    else
    {
    	int x=(int)st1.pop();
    	st2.push(x);
    	return reverse(st1);
    }
}

public static void main(String[] args)
{
	st1.push(1);
	st1.push(2);
	st1.push(3);

   System.out.println(st1);

	Stack st=reverse(st1);
    
    while(!st.empty())
    {
    	System.out.println(st.pop());
    }

	
} 


}



