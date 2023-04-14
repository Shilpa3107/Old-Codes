import java.util.*;
public class Even1 {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
checkeven(n);
    }
    public static void checkeven(int num){
        if(num%2==0)
        System.out.println("Even number");
        else
        System.out.println("Not a even number");
    }
}
