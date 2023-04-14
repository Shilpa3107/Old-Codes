import java.util.*;
public class Series {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int n = sc.nextInt();
       double sum =0.0;
       for(int i =2;i<=n;i=i+2){
       sum = sum+(Math.pow(x,i))/(findfact(i-1));
       }
       System.out.println("Sum of series : "+sum);
    }
    public static int findfact(int k){
        int f = 1;
        for(int i =1;i<=k;i++){
            f = f*i;
        }
        return f;
    }
}