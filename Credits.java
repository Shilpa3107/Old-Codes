import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Credits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =1;i<=T;i++){
            int X = sc.nextInt();
            if(X>65)
            System.out.println("Overload");
            else if(X<35)
            System.out.println("Underload");
            else 
            System.out.println("Normal");
        }
    }
}
