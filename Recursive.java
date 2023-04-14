public class Recursive {
    public static void main(String args[]){
        int i =5;
        recur(i);
    }
    public static void recur(int n){
        if(n==0)//base case
        return;
        System.out.print(n+" ");//print
        recur(n-1);//recursive
    }
}
