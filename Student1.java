import java.util.*;
public class Student1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double p3 = sc.nextDouble();
        result(p1,p2,p3);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Value of "+m+" which is raised to the power of "+n+" : "+findpow(m,n));
    }
    public static int findpow(int e,int p){
        int po = (int)Math.pow(e,p);
        return po;
    }
    public static void result(double a ,double b , double c){
        System.out.println("Marks 1."+a);
        System.out.println("Marks 2."+b);
        System.out.println("Marks 3."+c);
    }
}
