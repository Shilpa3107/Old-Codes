import java.util.*;
public class Sum {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int s = sum(n1,n2);
    System.out.println("Sum of two numbers : "+s);
    }
    public static int sum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}
