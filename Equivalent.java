import java.util.*;
public class Equivalent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String s1[] = new String[n1];
        String s2[] = new String[n2];
        String s11;
        String s22;
        for(int i =0;i<n1;i++){
            s1[i] = sc.next();
        }
        for(int i =0;i<n2;i++){
            s2[i] = sc.next();
        }
        s11 = String.join("",s1);
        s22 = String.join("",s2);
        if(s11.equals(s22))
        System.out.println("True");
        else
        System.out.println("False");
    }
}
