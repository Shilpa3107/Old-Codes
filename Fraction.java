import java.util.*;
public class Fraction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int den = sc.nextInt();
        int gcd=0;
        System.out.println("Original fraction : "+num+"/"+den);
        for(int i =1;i<=num&&i<=den;i++){
            if((num%i==0)&&(den%i==0))
            gcd = i;
        }
        int n1 = num/gcd;
        int d1 = den/gcd;
        System.out.println("Simplest fraction : "+n1+"/"+d1);
    }
}
