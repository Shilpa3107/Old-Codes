public class Recur4 {
   static int p =1;
    public static void main(String args[]){
        int n =5;
        System.out.println(printrecur(n));
    }
    public static int printrecur(int n){
        if(n==1)
        return 1;
        p = p*n;
        printrecur(n-1);
        return p;
    }
}
