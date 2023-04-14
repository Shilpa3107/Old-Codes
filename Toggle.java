import java.util.*;
public class Toggle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int oper = sc.nextInt();
        if(oper==0){
            int notbit = ~bitmask;
            int newno = notbit&n;
            System.out.println(newno);
        }
        else{//oper==1
           int newno = bitmask|n;
           System.out.println(newno);
        }
    }
}
