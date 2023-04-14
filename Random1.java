import java.util.*;
public class Random1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        double a[] = new double[n];
        //input
        for(int i =0;i<n;i++){
            a[i] = (double)(Math.random()*41+10);
        }
        System.out.println("Array elments : ");
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        double b[] = new double[n];
        for(int i=0;i<n;i++){
            b[i] = a[n-1-i];
        }
        System.out.println("Reverse array elements ");
        for(int i =0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        int sum=0;
        for(int i =0;i<n;i++){
         sum+=a[i]*b[i];
        }
        System.out.println("Dot product of a and b : "+sum);
    }
}
