import java.util.*;
public class CumulativeLength {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        int len=0;
        String s;
        //input
        for(int i = 0;i<n;i++){
          arr[i] = sc.next();
        }
        s = String.join("",arr);
        len = s.length();
        System.out.println("length : "+len);
    }
}
