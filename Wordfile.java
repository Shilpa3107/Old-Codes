import java.util.*;
public class Wordfile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String M=" ";
        for(int i=1;i<=T;i++){
            String S = sc.next();
            String R = sc.next();
            for(int j =0;j<5;j++){
                if(S.charAt(j)==R.charAt(j))
                 M = "G";
                else
                M = "B";
                System.out.print(M);
            }
            System.out.println();
        }
    }
}
