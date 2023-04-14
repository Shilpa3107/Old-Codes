import java.util.*;
public class Parser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        String s2 = g.replace("()","o");
        String s3 = s2.replace("(al)","al");
        System.out.println(s3);
    }
    
}
