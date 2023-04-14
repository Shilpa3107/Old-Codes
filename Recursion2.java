import java.util.*;
class Recursion2{
    static int f =1;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfact(n);
    }
    public static void printfact(int n){
    if(n==1){
        f=f*n;
        System.out.println(f);
        return;
    }
    f=f*n;
    printfact(n-1);
    }
}