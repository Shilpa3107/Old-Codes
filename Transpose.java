import java.util.*;
public class Transpose{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] num = new int[row][col];
        //input
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++)
                num[i][j] = sc.nextInt();
        }
        //output matrix
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++)
                System.out.print(num[i][j]+" ");
            System.out.println();
        }
        //output transpose matrix
        for(int i=0;i<col;i++){
            for(int j =0;j<row;j++)
                System.out.print(num[j][i]+" ");
            System.out.println();
        }
    }
}