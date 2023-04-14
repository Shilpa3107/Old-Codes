import java.util.*;
public class Weather {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A[] = new int[7];
        int s=0,r=0;
        for(int i=1;i<=T;i++){
            for(int j =0;j<7;j++){
                A[j] = sc.nextInt();
            }
            for(int k =0;k<7;k++){
                if(A[k]==1)
                 s++;
                 else
                 r++;
            }
            if(s>r)
            System.out.println("Yes");
            else
            System.out.println("No");
            s=0;
            r=0;
            
        }
    }
}
