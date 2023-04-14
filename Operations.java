import java.util.*;
public class Operations{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        String arr[] = new String [num];
        for(int i = 0;i<num;i++){
            arr[i]=in.next();
        }
        int x =0;
        for(int i=0;i<num;i++){
            if((arr[i].charAt(0)=='+') || (arr[i].charAt(2)=='+'))
            x = x+1;
            else
            x=x-1;
        }
        System.out.println("Value of x : "+x);
    }
}