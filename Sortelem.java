import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Sortelem {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int a[] = {20,17,13,10,8,4,2};
     int target = sc.nextInt();
     int start = 0;
     int len = a.length;
     int end = len-1;
     int ind=-1;
     while(start<=end){
        int mid = start+(end-start)/2;
        if(a[mid]==target){
        ind = mid;
        break;
        }
        else if(a[mid]>target)
        start = mid+1;
        else 
        end = mid-1;
     }
     System.out.println(ind);
    }
}   