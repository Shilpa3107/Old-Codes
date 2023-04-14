import java.util.*;
public class Disarium {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig ,t=0;
        int temp = num;
        //calculating size of number
        while(num>0){
            dig = num%10;
            t++;
            num = num/10;
        }
        //checking number is disarium or not
        if(findsum(temp,t)==temp)
        System.out.println("Disarium number");
        else
        System.out.println("Not a disarium number");
    }
    //finding sum 
    public static int findsum(int n,int p){
        int dig,sum=0;
        while(n>0){
            dig = n%10;
            sum = sum+(int)Math.pow(dig,p);
            n = n/10;
            p--;
        }
        return sum;
    }
}
