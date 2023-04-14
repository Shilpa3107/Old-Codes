import java.util.*;
public class GCD_max_min {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        //input
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int g =0;
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
            for(int j = 1;j<=min;j++){
                if((max%j==0)&&(min%j==0))
                g = j;
            }
        }
        System.out.println(g);
    }
}
