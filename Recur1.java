public class Recur1 {
    public static void main(String args[]){
        int n =1;
        printrecur(n);
    }
    public static void printrecur(int n){
        if(n==6)
        return;
        printrecur(n+1);
        System.out.println(n);
    }
}
