import java.util.*;
public class Student {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            int num = sc.nextInt();
            if(num>=90)
            System.out.println("This is good");
            else if((num>=60)&&(num<=89))
            System.out.println("This is also good");
            else if(num>=0 && num<=59)
            System.out.println("This is good as well");
             else
             System.out.println("Invalid");
            System.out.println("Want to continue ? (Yes(1) or no(0)");
           n = sc.nextInt();
        }while(n==1);
    }
}