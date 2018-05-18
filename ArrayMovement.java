import java.util.*;
class ArrayMovement
{
    public static int findmovements(String arr[][],String key,String obs)
    {
    	 int ch=key.charAt(0);
    	 ch=ch-65;
    	 int rk=ch/5;
    	 int ck=ch%5;    	 

    	 ch=(int)obs.charAt(0);
    	 ch=ch-65;
    	 int ro=ch/5;
    	 int co=ch%5;

    	 int count=0;

    	 //Bottom
          int r=rk+1;
          int c=ck;
          if((r!=ro||c!=co)&&r>=0&&r<5)
          	{count++;System.out.println("Bottom");}
         //BottomLeft
          r=rk+1;
          c=ck-1;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	{count++;System.out.println("BottomLeft");}
         //BottomRight
           r=rk+1;
           c=ck+1;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	 {count++;System.out.println("BottomRight");}
         //TopRight
          r=rk-1;
          c=ck+1;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	{count++;System.out.println("TopRight");}
          //TopLeft
          r=rk-1;
          c=ck-1;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	{count++;System.out.println("TopLeft");}
          //Left
          r=rk;
          c=ck-1;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	{count++;System.out.println("Left");}
         //Right
          r=rk;
          c=ck+1;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	{count++;System.out.println("Right");}
          //Top
          r=rk-1;
          c=ck;
          if((r!=ro||c!=co)&&r>=0&&r<5&&c>=0&&c<5)
          	{count++;System.out.println("Top");}
          
                   
           return count;

    }
	public static void main(String[] args)
	{
		String arr[][]={{"A","B","C","D","E"},{"F","G","H","I","J"},{"K","L","M","N","O"},{"P","Q","R","S","T"},{"U","V","W","X","Y",}};
        ArrayMovement obj=new ArrayMovement();
        System.out.println("Possible Movements");
        int move=obj.findmovements(arr,"W","N");

        System.out.println("No of Possible Movements:"+move);
	}
}