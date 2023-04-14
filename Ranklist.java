import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Ranklist {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int p=1,t=0;
        while(T>0){
            int X = sc.nextInt();
            if(X<=25){
            System.out.println(p);
            }
             else if(X>25){
                t=X;
                for(int j =1;j<=X;j++){
                   t= t-25;
                   p=j+1;
                  if(t>25){
                 continue;
                  }
                  else if(t<=25){
                  System.out.println(p);
                  break;  
                  }
                }
                
             }  
             p=1;
             T--;
        }
    }
}
