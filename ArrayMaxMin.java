import java.util.*;
public class ArrayMaxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i =0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            max = Math.max(max,num[i]);
            min = Math.min(min,num[i]);
        }
        System.out.println("Maximum Value : "+max);
        System.out.println("Minimum Value : "+min);
    }
}
