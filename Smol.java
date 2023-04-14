import java.util.*;
public class Smol {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i =1;i<=t;i++){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int g = (int)(Math.pow(10,9));
        if(n>=k){
        for(int j =1;j<=g;j++){
            n = n-k;
            if(n<k)
            break;
        }
    }System.out.println(n);

    }
    }
}
