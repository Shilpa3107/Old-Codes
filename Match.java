import java.util.*;
public class Match{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int P1[] = new int[n];
         int P2[] = new int[n];
        //int P11[] = new int[n];
        int sum1 =0,sum2=0,d=0,max=0,t=0,p=0,max1=0;
        //input
        //System.out.println("Enter player1 scores");
        for(int i = 0;i<n;i++){
            P1[i] = sc.nextInt();
            P2[i] = sc.nextInt();
        }
       // System.out.println("Enter player2 scores");
        
        //System.out.println("Difference");
        for(int i =0;i<n;i++){
            sum1 = sum1+P1[i];
            sum2 = sum2+P2[i];
           // System.out.println("P1 : "+sum1);
            //System.out.println("P2 : "+sum2);
            max = Math.max(sum2,sum1);
            if(max==sum1)
            d = sum1-sum2;
            else
            d = sum2-sum1;
           // System.out.println(d);
            max1 = Math.max(max1,d);
            if(sum1>sum2){
                t = t+d;
           // System.out.println("Player1");
            }
            else{
                p = p+d;
            //System.out.println("Player2");
            }
        }  
        if(t>p)
            System.out.println("1 "+max1);
         else
            System.out.println("2 "+max1);
            
    }
}