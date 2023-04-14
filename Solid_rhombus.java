public class Solid_rhombus {
    public static void main(String args[]){
        //outer loop
        for(int i =1;i<6;i++){
            //space print
            for(int k = 1;k<=6-i;k++){
                System.out.print(" ");
              //  System.out.print("K loop");
            }
            //inner loop
            for(int j = 1;j<=5;j++){
              System.out.print("*");
            }
            System.out.println();
        }
    }
}
