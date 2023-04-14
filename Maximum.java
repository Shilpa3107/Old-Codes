import java.util.*;
public class Maximum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        //input
        for(int i = 0;i<n;i++){
            s[i] = sc.nextLine();
        }
        int a[] = new int[n];
        int t =0; 
        for(int i =0;i<n;i++){
            t= count(s[i]);
            a[i]  = t;
        }
        int max=0;
        for(int i =0;i<n;i++){
            max = Math.max(max,a[i]);
        }
        System.out.println("Maximum number : "+max);
    }
    public static int count(String s){
        StringTokenizer st = new StringTokenizer(s);
        int t = st.countTokens();
        return t;
    }
}
