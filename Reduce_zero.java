import java.util.*;
public class Reduce_zero{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=0;
        while(n>0){
            if(n%2==0){
            n = n/2;
            t++;
            }
            if(n%2!=0){
            n = n-1;
            t++;
            }
        }
        System.out.println(t);
    }
}
