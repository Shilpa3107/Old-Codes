import java.util.*;
public class Pretty_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p=0;
        for(int i =1;i<=t;i++){
            int l =sc.nextInt();
            int r = sc.nextInt();
            int b[] = new int[r-l];
            for(int a =l;a<=r;a++){
             int dig = a%10;
             if(dig==2||dig==3||dig==9)
             p++;
            }
            System.out.println(p);
        }
    }
}
