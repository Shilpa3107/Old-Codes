import java.util.*;
public class Small {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int s =0;
        //input
        for(int i =0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]>arr1[j]){
                 s++;
                 arr2[i] = s;
                }
            }
            s=0;
        }
        //output
        for(int i =0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
