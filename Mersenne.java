import java.util.*;
public class Mersenne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //to check single mersenne number
        for(int i =0;i<=20;i++){
            if((int)Math.pow(2,i)==(num+1))
            System.out.println("It is a mersenne number");
           
        }
        //to check double mersenne number
        for(int i = 0;i<=20;i++){
            if((int)Math.pow(2,((int)Math.pow(2,i)-1))==(num+1))
            System.out.println("It is double mersenne number");
        }
        //generating mersenne number
        for(int i =1;i<=10;i++){
            System.out.print((int)(Math.pow(2,i)-1)+" ");
        }
        System.out.println();
        //generating double mersenne number
        for(int i=1;i<=6;i++){
            System.out.print((int)(Math.pow(2,((int)Math.pow(2,i)-1))-1)+" ");
        }
    }
    
}
