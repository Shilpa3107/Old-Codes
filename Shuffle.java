import java.util.*;
public class Shuffle {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//size of array
        int a[] = new int[n];
        int n1 = sc.nextInt();//to devide the array elements in equal half
        int x[] = new int[n1];
        int y[] = new int[n1];
        int b[] = new int[n];
        //input
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int j =0;j<n1;j++){
            x[j] = a[j];
        }
        for(int j =0;j<n1;j++){
            y[j] = a[j+n1] ;
        }  
         int c=0;
         for(int i=0;i<n1;i++){
            b[c++] = x[i];
            b[c++] = y[i];
         }
        for(int i =0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}