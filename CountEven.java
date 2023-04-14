import java.util.*;
public class CountEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=0,k=0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            int dig,num;
            num = a[i];
            while(num>0){
                dig = num%10;
                t++;
                num = num/10;
            }
            if(t%2==0)
            k++;
            t=0;
        }
        System.out.println(k);
    }
}
