import java.util.*;
public class Halve {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        String a=" ";
        String b=" ";
        int a1 = len/2;
        String m = s.toLowerCase();
        int c = len/2;
        a = m.substring(0,c);
        b = m.substring(c,len);
        int t1=0,t2=0;
        for(int i = 0;i<c;i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='e'||a.charAt(i)=='u')
            t1++;
            if(b.charAt(i)=='a'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='e'||b.charAt(i)=='u')
            t2++;
        }
        if(t1==t2)
        System.out.println(true);
        else
        System.out.println("false");
    }
}
