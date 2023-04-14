import java.util.*;
public class Palprime1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                if(n==2){
                for(int i = 10;i<=99;i++){
                if(printPrime(i))
                if(printPalindrome(i))
                 System.out.print(i);
                 }
                }else if(n==3){
                 for(int i = 100;i<=999;i++){
                 if(printPrime(i))
                 if(printPalindrome(i))
                 System.out.print(i+" ");
                 }
                 } else if(n==4){
                 for(int i = 1000;i<=9999;i++){
                 if(printPrime(i))
                 if(printPalindrome(i))
                 System.out.print(i+" ");
                 }
                 }else if(n==5){
                for(int i = 10000;i<=99999;i++){
                if(printPrime(i))
                if(printPalindrome(i))
                 System.out.println(i+" ");
                 }
                 }
                else
                System.out.println("Invalid input. Range is 2 to 5");
    }
    public static boolean printPrime(int num){
        int np=0;
        for(int i = 2;i<num;i++){
            if(num%i==0)
            np=i;
        }
        if(np==0)
        return true;
        else 
        return false;
    }
    public static boolean printPalindrome(int num){
        int dig,rev=0;
        int temp = num;
        while(num>0){
            dig = num%10;
            rev = (rev*10)+dig;
            num = num/10;
        }
        if(rev==temp)
        return true;
        else 
        return false;
    }
}