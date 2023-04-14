import java.util.*;
public class Prime2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2;i<=n;i++){
          if(printPrime(i))
          System.out.println(i);
        }
    }
    public static boolean printPrime(int num){
        int np=0,p=0;
        for(int i =2;i<num;i++){
            if(num%i==0)
            np=i;
            else
            p=i;
        }
        if(np==0)
        return true;
        else
        return false;
    }
}