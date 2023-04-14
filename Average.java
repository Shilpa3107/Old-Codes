import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
    public static void average(int x , int y , int z){
        double avg = (x+y+z)/3;
        System.out.println("Average : "+avg);
    }
}
