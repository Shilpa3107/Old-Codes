import java.util.*;
public class Altitude {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int gain[] = new int[l];
        int a[] = new int[l];
        //input
        for(int i =0;i<l;i++){
         gain[i] = sc.nextInt();
         }
        int max = 0,sum=0;
        for(int n:gain){
            sum+=n;
            if(sum>max)
            max = sum;
        }
        System.out.println(max);
    }
}
