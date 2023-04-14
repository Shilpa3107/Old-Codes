import java.util.*;
public class Prime1{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
try{
int n = sc.nextInt();
checkprime(n);
}
finally{
    System.out.println("No error");
}
    }
    public static void checkprime(int num){
        int var=0;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                var=i;
            }
           
        }
       // System.out.print(np+" "+p);
       if(var==0)
        System.out.println("Prime number");
        else
        System.out.println("Not a Prime number");
    }
}
