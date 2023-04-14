import java.util.*;
public class Recursion5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int x = 2;
        int t = calcpow(x,n);
        System.out.println(t);
    }
    public static int calcpow(int x , int n){
       if(n==0){
       return 1;
       }
       if(x==0){
       return 0;
       }
       //if n is even
       if(n%2==0){
       return  calcpow(x, n/2)*calcpow(x, n/2);
       }
       else{   //n is odd
        return calcpow(x, n/2)*calcpow(x,n/2)*x;
       }
    }
}
