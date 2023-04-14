import java.util.*;
public class Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        printCircum(r);
    }
    public static void printCircum(int a){
        final double pi = 3.14;
        double c = 2*pi*a;
        System.out.println("Circumference of the circle : "+c);
    }
}
