import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];
        int n1 = sc.nextInt();
        //input
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //searching
        for(int i =0;i<n;i++){
            if(a[i]==n1)
            System.out.println("Element "+n1+" is found at the index "+(i+1));
        }
    }
}
