public class Inverted_Half_Pyramid3 {
    public static void main(String args[]){
        for(int i =1;i<5;i++){
            for(int k = 4-i;k>=0;k--){
                System.out.print(" ");
               // System.out.print("K statement");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
