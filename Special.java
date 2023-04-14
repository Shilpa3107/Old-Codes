import java.util.*;
public class Special {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig,sum=0;
        int temp = num;
        int f= 1;
        while(num>0){
            dig = num%10;
            for(int i =1;i<=dig;i++){
                f = f*i;
            }
            sum = sum+f;
            num = num/10;
            f= 1;
        }
        if(sum==temp)
        System.out.println("It is a special number");
        else
        System.out.println("It is not a special number");
    }
}
