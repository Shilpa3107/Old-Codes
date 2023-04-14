import java.util.*;
public class Recursion4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(printpo(x,n));
    }
    public static int printpo(int x,int n){
      if(n==0)
      return 1;
      if(x==0)
      return 0;
     int p=printpo(x,n-1);
     int p1 = x*p;
     return p1;

    }
}
