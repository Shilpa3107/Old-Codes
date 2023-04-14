import java.util.*;
public class Odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printOdd(num);
    }
    public static void printOdd(int n){
        for(int i=1;i<=n;i++){
          if(i%2!=0){
            System.out.println(i);
          }
        }
    }
}
