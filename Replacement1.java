import java.util.*;
public class Replacement1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i)=='e')
            sb.setCharAt(i,'i');
        }
        System.out.println(sb);
    }
}
