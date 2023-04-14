import java.util.*;
public class Red_Green {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int s =0;
        for(int i =1;i<=T;i++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int H[] = new int[N];
            for(int j=0;j<N;j++){
                H[j] = sc.nextInt();
            }
            for(int k=0;k<N;k++){
                if(H[k]>K)
                s++;
            }
            System.out.println(s);
            s=0;
        }
    }
}
