import java.util.*;
public class ArraySort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i =0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int t =0;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<num.length;i++){
            min = Math.min(min,num[i]);
            if(min==num[i])
            t=i;
        }
        //System.out.println(min);
         if(t==0)
         System.out.println("Sorted in ascending order");
         else
         System.out.println("Not sorted in ascending order");
    }
}
