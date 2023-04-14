public class Number_Pyramid {
    public static void main(String args[]){
        for(int i =1;i<6;i++){
             for(double k =4;k>=i;k--){
                System.out.print(" ");
          }
            //inner loop
            for(int j =1;j<=i;j++){
                System.out.print(i+" ");
            }
             System.out.println();
        }
    }
    
}
