import java.util.*;
public class LCM_GCD {
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int p =1;
    for(int i =1;i<=num1&&i<=num2;i++){
        if(num1%i==0&&num2%i==0)
            p = i;
    }
     System.out.println("GCD : "+p);
    int l = (num1*num2)/p;
    System.out.println("LCM : "+l);
    
    
}
}
