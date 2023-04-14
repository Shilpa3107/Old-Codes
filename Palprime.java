import java.util.*;
public class Palprime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int np=0,p=0,dig,rev=0;
        for(int i =2;i<num;i++){
            if(num%i==0)
            np=i;
            else
            p=i;
        }
        if(np==0){
            int t = num;
            while(num>0){
               dig = num%10;
               rev = (rev*10)+dig;
               num = num/10;
            }
           if(rev==t)
            System.out.println("Palprime number");
            else
            System.out.println("Not a palprime number");
        }
        else
        System.out.println("Not a palprime number");
}
}
