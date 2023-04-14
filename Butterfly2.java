public class Butterfly2 {
    public static void main(String args[]){
        //upper half
        for(int i = 1;i<=4;i++){
            for(int j =1;j<=i;j++)
                System.out.print("*");
            for(int k = 1;k<=8-(i*2);k++)                
                System.out.print(" ");
            for(int j =1;j<=i;j++)
                System.out.print("*");
                System.out.println();
        }
        //lower half
        for(int i = 4;i>=1;i--){
            for(int j =1;j<=i;j++)
                System.out.print("*");
            for(int k = 1;k<=8-(i*2);k++)                
                System.out.print(" ");
            for(int j =1;j<=i;j++)
                System.out.print("*");
                System.out.println();
        }
    }
}
