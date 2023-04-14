import java.util.*;
public class Conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = Integer.toBinaryString(n);
        int t=0;
        for(int i =0;i<b.length();i++){
        if(b.charAt(i)=='1')
        t++;
        }
        System.out.println("Number of ones : "+t);
    }
}
