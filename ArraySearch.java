import java.util.*;
public class ArraySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int num[] = new int[size];
        for(int i =0;i<size;i++){
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i =0;i<num.length;i++){
            if(x==num[i])
            System.out.println("Index of "+x+" is at "+i);
        }
    }
}
