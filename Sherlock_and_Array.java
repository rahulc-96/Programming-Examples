import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] arr)
    {
       int i=0; int j=arr.length-1; int sum=0;
    
       while(i!=j)
       {
           if(sum>=0)
           {
               sum-=arr[j];
               j--;
           }else
           { sum=sum+arr[i]; i++;}
       }
              
     if (sum==0)
         return "YES";
    else
        return "NO";
    
    }
    
     static int sum(int[] vt,int n)
   {
        int sum=0;
        for(int i=0;i<n;i++)
        	sum=sum+vt[i];

        return sum;
   }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}