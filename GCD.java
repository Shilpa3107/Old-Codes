import java.util.*;
public class GCD{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printgcd(a,b);
    }
    public static void printgcd(int n1,int n2){
        int t =0;
        for(int i =1;i<=n1&&i<=n2;i++){
            if(n1%i==0&&n2%i==0)
               t=i;
        }
        System.out.println("GCD : "+t);
    }
}
