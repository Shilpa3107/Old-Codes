import java.util.*;
public class Vote{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printEligible(num);
    }
    public static void printEligible(int n){
        if(n>18)
        System.out.println("This person is eligible to vote");
        else
        System.out.println("This person is not eligible to vote");
    }
}
