import java.util.*;

public class InToPost
{
  
  static Stack<Character> st=new Stack<Character>();


  public static int precedence(char ch)
  {
    switch(ch)
    {
        case '+':
        case '-':
        return 1;

        case '/':
        case '*':
        return 2;

        case '^':
        return 3;

    }
    
    return -1;
  }
  public static String infixtopostfix(String exp)
  { 
    
       String res="";

       for(int i=0;i<exp.length();i++)
       {
        char ch=exp.charAt(i);

        if(Character.isLetterOrDigit(ch))
        {
            res=res+ch;
        }
        else if(ch=='(')
            st.push(ch);
        else if(ch==')')
        {
            while(!st.isEmpty()&&st.peek()!='(')
                res=res+st.pop();

            if(st.isEmpty())
                return "INVALID EXPRESSION";
            else
                st.pop();
        }
        else if(st.isEmpty()||precedence(ch)>precedence(st.peek()))
            st.push(ch);
        else
        {
            while(!st.isEmpty()&&precedence(ch)<=precedence(st.peek()))
                res=res+st.pop();

            st.push(ch);
        }

       }

         while(!st.isEmpty())
            {   
                if(st.peek()=='(')
                   return "INVALID EXPRESSION";
                res=res+st.pop();
            }

        return res;
  }

  public static void main(String[] args) 
    {
        String exp = "a+(b*c)";
        System.out.println(infixtopostfix(exp));
    }

 
}

