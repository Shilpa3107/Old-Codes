public class Number_Pyramid1 {
    public static void main(String args[]){
        for(int i =1;i<6;i++){
            for(int k = 1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}