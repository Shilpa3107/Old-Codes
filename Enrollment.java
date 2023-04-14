import java.util.*;
public class Enrollment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
           int X = sc.nextInt();
           int Y = sc.nextInt();
           if(Y>=X)
           System.out.println(Y-X);
           else 
           System.out.println("0");
            T--;
        }
    }
}
