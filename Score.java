import java.util.*;

public class Score {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int a[] = {2,4,6,7,8,9,10,12};
    int ele = sc.nextInt();
    int len = a.length;
    int start = 0;
    int end = len-1;
    int ind =-1;
    while(start<=end){
      int mid = (int)(start + (end-start)/2);
      if(ele==a[mid]){
      ind= mid;
      break;
      }
      else if(ele<a[mid])
      end = mid-1;
      else 
      start = mid+1;
      
  }
  System.out.println(ind);
}
}