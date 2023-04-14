import java.util.*;
public class Age {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        if((A>=X)&&(A<=Y))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}
