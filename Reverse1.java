import java.util.*;
public class Reverse1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char c = sc.next().charAt(0);
        int t = word.indexOf(c);
        String s = word.substring(0,t+1);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String k = sb.toString()+word.substring(t+1,word.length());
        System.out.println(k);
    }
}
