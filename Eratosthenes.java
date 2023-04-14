import java.util.*;
public class Eratosthenes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            if(prime(i))
            System.out.print(i+" ");
        }
    }
        public static boolean prime(int n){
        int np=0,p=0;
        for(int i =2;i<n;i++){
            if(n%i!=0)
            p++;
            else
            np++;
        }
        if(np==0)
        return true;
        else 
        return false;
    }
}