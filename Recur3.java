public class Recur3 {
static int s = 0;
    public static void main(String args[]){
        int n =10;
        System.out.println(printrecur(n));
    }
    public static int printrecur(int n){
        if(n==0)
        return 1;
        s=s+n;
        printrecur(n-1);
        return s;
    }
}
