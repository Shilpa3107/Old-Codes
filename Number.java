import java.util.*;
public class Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        String w = sc.next();
        int t=0;
        //input
        for(int i =0;i<n;i++){
            a[i] = sc.next();
        }
        for(int i =0;i<a.length;i++){
            if(w.contains(a[i]))
                   t++;
                
            
        }
       System.out.println(t);
    }
}
