import java.util.*;
public class Table {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printTable(n);    
    }
    public static void printTable(int num){
        for(int i =1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
