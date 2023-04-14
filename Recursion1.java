import java.util.*;
public class Recursion1 {
    static int sum =0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printrecu(n);
    }
    public static void printrecu(int n){
        if(n==0){
        sum= sum+n;
        System.out.println(sum);
        return;
        }
        sum= sum+n;
        printrecu(n-1);
        
    }
}
