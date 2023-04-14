import java.util.*;
public class Circle1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        final float PI = 3.14f;
        float a = PI*r*r;
        float p = 2*PI*r;
        System.out.println("Radius : "+r);
        System.out.println("Area : "+a);
        System.out.println("Perimeter : "+p);
    }
}
