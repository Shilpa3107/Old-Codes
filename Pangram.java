import java.util.*;
public class Pangram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String M = s.toLowerCase();
        String K = duplicate(M);
        int len = K.length();
        int t=0;
        for(int i =0;i<len;i++){
            if(duplicate(M).charAt(i)>='a'&&duplicate(M).charAt(i)<='z')
            t++;
        }
        if(t==26)
        System.out.println("true");
        else
        System.out.println("false");
    }
    public static String duplicate(String s1){
        String str = new String();
        int len = s1.length();
        for(int i =0;i<len;i++){
            char c = s1.charAt(i);
            if(str.indexOf(c)<0)
            str+= c;
        }
        return str;
    }
}
