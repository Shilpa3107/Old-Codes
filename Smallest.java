import java.util.*;
public class Smallest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
		    for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i =0;i<n;i++){
                b[i] = sc.nextInt();
            }
		    int p =0;
		    for(int i =0;i<n;i++){
		        if(a[i] != 0  && b[i] != 0)
		        p++;
		    }
		    System.out.println(p);
		}
    }
}