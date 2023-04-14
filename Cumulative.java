import java.util.*;
public class Cumulative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        //input
        for(int i =0;i<n;i++){
            a[i]= sc.next();
        }
        String s = String.join("",a);
        StringBuilder sb = new StringBuilder(s);
         
         System.out.println(sb.length());
    }
}
