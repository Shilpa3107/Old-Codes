import java.util.*;
public class Eligible {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int b = 0;
		for(int i =1;i<=T;i++){
		    int N = sc.nextInt();
		    int A[] = new int[N];
		    for(int j = 0;j<N;j++){
		        A[j] = sc.nextInt();
		    }
		    for(int k = 0;k<A.length;k++){
		        if(A[k]>=10||A[k]<=60){
		           b=k;
		        }
		    }
		     System.out.println(b);
		    }
    }
}
