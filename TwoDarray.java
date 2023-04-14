import java.util.*;
public class TwoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s[][] = new int[2][4];
        int sum=0;
        for(int i=0;i<2;i++){
            System.out.println("Enter sales of salesman "+(i+1));
            for(int j =0;j<4;j++){
                System.out.print("Month "+(j+1)+" :");
                s[i][j] = sc.nextInt();
                sum = sum+s[i][j];
            }
            System.out.println();
            System.out.println("Total sales of salesman "+(i+1)+" "+sum);
            sum=0;
        }
    }
}
