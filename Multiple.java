import java.util.*;
public class Multiple{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i=1;i<5000;i++){
            if((i%2==0)&&(i%n==0))
            min = Math.min(min,i);
        }
        System.out.println(min);
    }
}