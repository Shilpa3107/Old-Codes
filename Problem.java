import java.util.*;
public class Problem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s=0,l=0;
        for(int i =1;i<=t;i++){
            int n = sc.nextInt();
            String a[] = new String[n];
            for(int j = 0;j<n;j++){
                a[j] = sc.next();
            }
            for(int j = 0;j<n;j++){
                if(a[j].charAt(0)=='S')
                s++;
                else
                l++;
            }
            System.out.println(s+" "+l);
        }
    }
}
