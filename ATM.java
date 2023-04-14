import java.util.*;
public class ATM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double C=0.0;
        if(X%5==0){
            if(Y>=(X+0.50)){
                C = Y-(X+0.50);
                System.out.println(C);
            }
            else // Y<(X+0.50)
            System.out.println(Y);
        }
        else //X%5!=0
        System.out.println(Y);
    }
}
