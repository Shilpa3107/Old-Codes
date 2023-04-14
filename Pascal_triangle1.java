import java.util.*;
public class Pascal_triangle1{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    for(int i = 0;i<=num;i++){
        for(int j = 0;j<=num-i;j++)
        System.out.print(" ");
        int b =0;
       for(;b<=i;b++)
         System.out.print((printFactorial(i))/((printFactorial(i-b))*(printFactorial(b)))+" ");
        System.out.println();
    }
}
public static int printFactorial(int n){
    int f = 1;
    for(int i = 1;i<=n;i++){
        f= f*i;
    }
    return f;
}
}