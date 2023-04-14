import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig,rev=0,temp;
        temp =n;
        while(n>0){
            dig = n%10;
            rev = (rev*10)+dig;
            n = n/10;
        }
        if(rev==temp)
        System.out.println("Palindrome number");
        else
        System.out.println("Not a Palindrome number");
    }
}
