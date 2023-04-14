import java.util.*;
public class Username {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.delete(sb.length()-10,sb.length());
        System.out.println(sb);
    }
}
