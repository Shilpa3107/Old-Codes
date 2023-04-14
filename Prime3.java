import java.util.*;
public class Prime3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1;i<=t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = a+b;
            int p=0,np=0;
            for(int j =2;j<s;j++){
                if(s%j==0){
                np=np+j;
                }
                else if(s%j!=0){
                p = p+j;
                }
            }
            System.out.println(p+" "+np);
            
            if(np==0)
            System.out.println("Prime number");
            else
            System.out.println("Not a prime number");
            p=0;
            np=0;
            s=0;
        }
    }
}
