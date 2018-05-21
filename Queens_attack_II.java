import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int rRObs=-1;
        int cRObs=-1;
        int rLObs=-1;
        int cLObs=-1;
        int rTObs=-1;
        int cTObs=-1;
        int rBObs=-1;
        int cBObs=-1;
        int rTRObs=-1;
        int cTRObs=-1;
        int rTLObs=-1;
        int cTLObs=-1;
        int rBLObs=-1;
        int cBLObs=-1;
        int rBRObs=-1;
        int cBRObs=-1;
        
        int i=0;
        int ro,co;
        for(i=0;i<k;i++)
        {
            ro=obstacles[i][0];
            co=obstacles[i][1];
            
            //Left
            if((rLObs==-1||cLObs<co)&&(ro==r_q&&co<c_q))
            {
                rLObs=ro;
                cLObs=co;
            }
            //Right
            if((rRObs==-1||co<cRObs)&&ro==r_q&&co>c_q)
            {
                rRObs=ro;
                cRObs=co;
            }
            //Top
            if(((rTObs==-1)||(rTObs>ro))&&co==c_q&&ro>r_q)
            {
                rTObs=ro;
                cTObs=co;
            }
            //Bottom
            if((rBObs==-1||rBObs<ro)&&co==c_q&&ro<r_q)
            {
                rBObs=ro;
                cBObs=co;
            }
            //BottomLeft
            if((c_q-co==r_q-ro)&&(co<c_q&&ro<r_q)&&(rBLObs==-1||(cBLObs<co&&rBLObs<ro)))
            {
                rBLObs=ro;
                cBLObs=co;
            }
            //BottomRight
            if(r_q-ro==co-c_q&&r_q>ro&&c_q<co&&(rBRObs==-1||(ro>rBRObs&&co<cBRObs)))
            {
                rBRObs=ro;
                cBRObs=co;
            }
            //TopRight
            if(co-c_q==ro-r_q&&ro>r_q&&co>c_q&&(rTRObs==-1||ro<rTRObs&&co<cTRObs))
            {
                rTRObs=ro;
                cTRObs=co;
            }

            //TopLeft
            if(c_q-co==ro-r_q&&ro>r_q&&co<c_q&&(cTLObs==-1||ro<rTLObs&&co>cTLObs))
            {
                rTLObs=ro;
                cTLObs=co;
            }
         }
            int count=0;
            //Bottom
            count+=(rBObs!=-1)?(-rBObs+r_q-1):(r_q-1);
            //System.out.println(count);
            //Top
            count+=(rTObs!=-1)?(rTObs-r_q-1):(n-r_q);
            //System.out.println(count+" "+rTObs);       
            //Right
            count+=(cRObs!=-1)?(cRObs-c_q-1):(n-c_q);
            //System.out.println(count);
            //Left
            count+=(cLObs!=-1)?(c_q-cLObs-1):(c_q-1);
            //System.out.println(count);
            //BottomRight
            count+=(cBRObs!=-1)?(cBRObs-c_q-1):Math.min(r_q-1,n-c_q);
            //System.out.println(count);
            //BottomLeft
            count+=(cBLObs!=-1)?(c_q-cBLObs-1):Math.min(r_q-1,c_q-1);
            //System.out.println(count);
            //TopRight
            count+=(cTRObs!=-1)?(-c_q+cTRObs-1):Math.min(n-r_q,n-c_q);
            //System.out.println(count);
            //TopLeft
            count+=(cTLObs!=-1)?(c_q-cTLObs-1):Math.min(n-r_q,c_q-1);
            //ystem.out.println(count);
            return count;
        }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
