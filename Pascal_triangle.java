import java.util.*;
public class Pascal_triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
        //space print
        for(int j = 1;j<=num-i;j++)
        System.out.print(" ");
        //print Pascal triangle
        for(int j = 0;j<=i;j++)
         System.out.print(printFactorial(i)/(printFactorial(i-j)*printFactorial(j))+" ");
         System.out.println();
        }
    }
    public static int printFactorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++)
        f = f*i;
        return f;
    }
}
