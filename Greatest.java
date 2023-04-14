import java.util.*;
public class Greatest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printLarge(a,b);
    }
    public static void printLarge(int x, int y){
        int z = Math.max(x,y);
        System.out.println("Greatest number among two : "+z);
    }
}
