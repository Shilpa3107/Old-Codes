import java.util.*;
public class Triangular {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int t=0;
        for(int i =1;i<=50;i++){
            sum = sum+i;
            if(sum<num)
            continue;
            if(sum>num)
            break;
            if(sum==num){
            t++;
            break;
            }
        }
        if(t!=0)
        System.out.println("Triangular number");
        else
        System.out.println("Not a triangular number");
    }
}
