public class Recur2 {
    public static void main(String args[]){
     int n =1;
     printrecur(n);
    }
    public static void printrecur(int n){
        if(n==6)
        return;
        System.out.println(n);
        printrecur(n+1);
        
    }
}
