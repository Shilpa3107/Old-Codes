import java.util.*;
public class Power1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=0;
        for(int i =0;i<=100;i++){
         if(n==(int)Math.pow(2,i))
         t++;
        }
        if(t!=0)
        System.out.println("Yes");
        else 
        System.out.println("No");
    }
}
