import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int p=0 , np=0;
        for(int  i =2;i<num;i++){
             if(num%i==0){
            np = i+np;
              } else if (num%i!=0){
            p=p+i;
              }
        }
        if(np==0)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
    
}
