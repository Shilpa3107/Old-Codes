public class Recursive1 {
    public static void main(String args[]){
     int n  = 1;
     printRecur(n);
    }
    public static void printRecur(int n){
        if(n>5)
        return;
        System.out.print(n+" ");
        printRecur(n+1);
    }
}
