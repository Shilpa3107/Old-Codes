import java.util.*;
public class Magic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       if(num%9==1)
        System.out.println("Magic number");
        else
        System.out.println("Not a magic number");
    }
}