import java.util.*;
public class Jewel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String j = sc.next();
        String s = sc.next();
        int p =0;
        for(int i =0;i<s.length();i++){
            for(int k =0 ;k<j.length();k++)
           if(s.charAt(i)==j.charAt(k))
           p++;
        }
        System.out.println(p);
    }
}
