import java.util.*;
public class Random {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a[] = new double[n];
        //input
        for(int i =0;i<n;i++){
          a[i] = Math.random()*(50-10+1)+10;
        }
        double avg = 0.0;
        double max = 0.0;
        //output
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i =0;i<n;i++){
            max = Math.max(max,a[i]);
        }
        System.out.println("Maximum element : "+max);
        for(int i =0;i<n;i++){
            avg = (avg+a[i])/n;
        }
        System.out.println("Average  : "+avg);
    }
}
