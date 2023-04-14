import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        System.out.println("Invalid number");
        else{
        int facto = fact(n);
        System.out.println(facto);
        }
    }
    public static int fact(int num){
        int f = 1;
            for(int i =1;i<=num;i++){
                f = f*i;
            }
           return f;
    }
}