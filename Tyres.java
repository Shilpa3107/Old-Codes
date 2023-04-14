import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Tyres {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =1;i<=T;i++){
            int t=0;
            int N = sc.nextInt();
            if(N%4==0){
                t = N/4;
                if((N-t*4)==0)
                System.out.println("No");
                else if((N-t*4)!=0){
                    if((N-t*4)%2==0)
                    System.out.println("Yes");
                    else
                    System.out.println("No");
                }
            }
            else if((N%2==0)&&N!=0)
            System.out.println("Yes");
            else 
            System.out.println("No");
        }
    }
}
