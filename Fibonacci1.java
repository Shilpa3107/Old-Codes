import java.util.*;
public class Fibonacci1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0,s=1,t=0;
        int sum =f+s;
        for(int i =0;i<n-2;i++){
            t = f+s;
            sum = sum+t;
            f=s;
            s=t;      
        }
        System.out.println(sum);        
    }
}
