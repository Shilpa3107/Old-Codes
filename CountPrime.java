import java.util.*;
class CountPrime {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t =0;
        for(int i = 2;i<n;i++){
            if(prime(i))
            t++;
        }
        System.out.println(t);        
    }
    public static boolean prime(int k){
        for(int i =2;i*i<=k;i++){
            if(k%i==0)
            return false;
        }
        return true;
    }
}
