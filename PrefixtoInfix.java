import java.util.*;
class PrefixtoInfix
{
  static Stack<String> st=new Stack<String>();
    
   public static boolean isOperator(char ch)
   {
    if(ch=='+'||ch=='*'||ch=='-'||ch=='/'||ch=='^')
      return true;
    else
      return false;
   }

  public static String prefixtoinfix(String exp)
  {
    for(int i=exp.length()-1;i>=0;i--)
    {
      char ch=exp.charAt(i);
      if(Character.isLetterOrDigit(ch))
      {
        st.push(Character.toString(ch));
      }
          
           if(isOperator(ch))
           {
                 
                 String op1=st.pop();
                 String op2=st.pop();

                 String res=op1+Character.toString(ch)+op2;
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
      String s="*-A/BC-/AKL";
      System.out.println(prefixtoinfix(s));
     }
}
