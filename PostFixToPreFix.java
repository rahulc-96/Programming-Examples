import java.util.*;
class PostFixToPreFix
{
	static Stack<String> st=new Stack<String>();
    
   public static boolean isOperand(char ch)
   {
   	if(!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')))
   		return true;
   	else
   		return false;
   }

	public static String postfixtoprefix(String exp)
	{
		for(int i=0;i<exp.length();i++)
		{
			char ch=exp.charAt(i);
			if(Character.isLetterOrDigit(ch))
			{
				st.push(Character.toString(ch));
			}
          
           if(isOperand(ch)&&!st.isEmpty())
           {
                 
                 String op1=st.pop();
                 String op2=st.pop();

                 String res=Character.toString(ch)+op1+op2;
                 st.push(res);
           }

       }

              if(st.isEmpty())
              	return "INVALID EXPRESSION";
              else
              	return st.pop();
            

     }


     public static void main(String[] args)
     {
     	String s="ABC/-AK/L-*";
     	System.out.println(postfixtoprefix(s));
     }
}
