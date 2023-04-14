import java.util.*;
public class Coins {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
       for(int i =1;i<=T;i++){
         int X = sc.nextInt();
        if(X>=10){
            while(X>0){
                X=X-10;
                if(X>=1&&X<=9)
                break;
            }
            System.out.println(X);
        }
        else if(X<10)
        System.out.println(X);
       }
    }
}
