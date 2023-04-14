import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner fo = new Scanner(System.in);
        int n = fo.nextInt();
        int f =0,s=1;
        System.out.print(f+" ");
        System.out.print(s+" ");
        for(int i = 1;i<=n-2;i++){
           int t=f+s;
            f = s;
            s = t;
            System.out.print(t+" ");
}}}