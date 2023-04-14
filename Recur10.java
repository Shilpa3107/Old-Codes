public class Recur10 {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        System.out.println(checkrecur(a,0));
    }
    public static boolean checkrecur(int a[], int ind){
        if(ind==a.length-1)
        return true;
         if(a[ind]>=a[ind+1])
        return false;
        else 
        return checkrecur(a, ind+1);
    }
}
