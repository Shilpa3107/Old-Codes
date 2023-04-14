import java.util.*;
public class Plate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1;i<=T;i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();
            int P = 2*(N+M);
            System.out.println(P*X);
        }
        //int P = 2*(N+M);
    }
}
