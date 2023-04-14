import java.util.*;
public class Point{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Point1 : "+x1+","+y1);
        System.out.println("Point2 : "+x2+","+y2);
        double mx = (x1+x2)/2;
        double my = (y1+y2)/2;
        System.out.println("Midpoint : "+mx+","+my);
    }
}
