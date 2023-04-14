import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Agnotistic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in sorted ");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter searching element");
        int target = sc.nextInt();
        if(n==1){
            if(target == a[0])
            System.out.println("0");
            else
            System.exit(0);
        }
        else{
        int start=0;
        int as =0,ds=0;
        int end = n-1;
        int ind = -1;
        if(a[0]>a[1])
        ds++;
        else
        as++;
        if(as!=0){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]==target){
                ind = mid;
                break;
            }
            else if(target<a[mid])
            end = mid-1;
            else 
            start = mid+1;
        }
    }if(ds!=0){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(a[mid]==target){
                ind = mid;
                break;
            }
            else if(target<a[mid])
            start = mid+1;
            else 
            end = mid-1;
        }
    } 
    System.out.println(ind);
    }
}
}
