import java.util.*;
public class Multiply {
    public static int product(int num1, int num2){
        int p = num1*num2;
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = product(a,b);
        System.out.print("Product of two numbers : "+pro);
    }
    
}
