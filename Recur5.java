public class Recur5 {
    static int k=0;
    public static void main(String args[]){
        int n = 8;
        int f=0;
        int s=1;
        System.out.println(f);
        System.out.println(s);
        printrecur(f,s,n-2);
    }
    public static void printrecur(int f,int s,int n){
        if(n==0)
        return;
        k = f+s;
        System.out.println(k+" ");
        printrecur(s,k,n-1);
    }
}
