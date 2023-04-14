import java.util.*;
public class XOR {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int t=0;
        int num[] = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = start+2*i;
        }
        t = num[0];
        for(int i =1;i<n;i++){
            t = t^num[i];
        }
        System.out.println(t);
    }
}
