import java.util.*;
public class Local_Matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
       int b [][] = new int[a.length-2][a[0].length-2];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j] = findmax(i,j,a);
            }
        }
        System.out.println("Old matrix");
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("New matrix");
        for(int i =0;i<n-2;i++){
            for(int j =0;j<n-2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int findmax(int x,int y ,int a[][]){
        int x1 = x+3;
        int y1 = y+3;
        int max=0;
        for(int i =x;i<x1;i++){
            for(int j =y;j<y1;j++){
                if(a[i][j]>max)
                max = a[i][j];
            }
        }
        return max;
    }
}
