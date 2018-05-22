import java.util.*;
class Summation
{
   public static void main(String[] args)
   {
   	Scanner obj=new Scanner(System.in);
   	System.out.println("Enter the number of operands");
   	int n=obj.nextInt();
   	Vector<Integer> vt=new Vector<Integer>();
   	for(int i=0;i<n;i++)
   	{
   		vt.add(obj.nextInt());
   	}
   	sum(vt,n);

   }

   static void sum(Vector<Integer> vt,int n)
   {
        int sum=0;
        for(int i=0;i<n;i++)
        	sum=sum+vt.get(i);

        System.out.println("Required sum="+sum);
   }

}
