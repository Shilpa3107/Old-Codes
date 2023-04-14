import java.util.*;
public class Numbers {
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(checkArm(num)){
        System.out.println("This is an armstrong number");
        printArm();
        }
        else if(checkArmlike(num)){
        System.out.println("This is an armstronglike number");
        printArmLike();
        }
        else {
        System.out.println("This is neither an armstrong number nor armstronglike number");
        System.exit(0);
        }      
    }
    public static boolean checkArm(int num){
        int dig=0,sum=0,temp;
        temp = num;
        while(num>0){
            dig = num%10;
            sum = sum+Math.pow(dig,3);
            num = num/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
    public static boolean checkArmlike(int num){
        int n1,n2,n3,temp,sum=0;
        temp=num;
        n1 = num%100;
        num = num/100;
        n2 = num%100;
        num= num/100;
        n3 = num;
        sum = sum+Math.pow(n1,3)+Math.pow(n2,3)+Math.pow(n3,3);
        if(sum==temp)
        return true;
        else 
        return false;
    }
    public static void printArm(){
        int dig ,sum=0,n;
        for(int i = 100;i<=999;i++){
            n=i;
            while(i>0){
            dig = i%10;
            sum = sum+Math.pow(dig,3);
            i = i/10;
            }
            if(n==sum)
            System.out.println(n);
        }
    }
    public static void printArmLike(){
        int n1,n2,n3,sum=0,temp;
        for(int i = 100000;i<=999999;i++){
            temp = i;
            n1 = i%100;
            i = i/100;
            n2 = i%100;
            i = i/100;
            n3 = i;
            sum = sum+Math.pow(n1,3)+Math.pow(n2,3)+Math.pow(n3,3);
            if(temp==sum)
            System.out.println(i);
        }
    }
}
