import java.util.*;
public class Power{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
         printPower(x,n);
    }
    public static void printPower(int a, int b){
        double p = Math.pow(a,b);
        System.out.println(p);
    }
}
