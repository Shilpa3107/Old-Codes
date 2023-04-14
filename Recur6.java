public class Recur6 {
    public static void main(String args[]){
        int n =4,x=2;
        System.out.println(printrecur(x,n));
    }
    public static int printrecur(int x,int n){
        if(n==0)
        return 1;
        if(x==0)
        return 0;
        int t = (int)Math.pow(x,n);
        printrecur(x,n-1);
        return t;
    }
}
