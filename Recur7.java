public class Recur7 {
    static int t =0;
    public static void main(String args[]){
        int x  = 2,n=4;
        System.out.println(printrecur(x,n));
    }
    public static int printrecur(int x,int n){
        if(n==0)
        return 1;
        if(x==0)
        return 0;
        if(n%2==0)
        t = printrecur(x,n/2)*printrecur(x,n/2);
        else
        t = printrecur(x,n/2)*printrecur(x,n/2)*x;
        return t;
    }
}
