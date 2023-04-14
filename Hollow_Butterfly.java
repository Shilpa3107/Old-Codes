public class Hollow_Butterfly{
    public static void main(String args[]){
        //upper half 
        //left hand
        //only two
        for(int i =1;i<=2;i++){
            for(int  j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=10-(i*2);k++){
                System.out.print(" ");
            }
            //right hand side
            //only two
            for(int  j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //left hand side
        //three to four
        for(int i = 3;i<=5;i++){
            for(int j = 1;j<=2;j++){
                System.out.print("*");
                if(j==2)
                break;
                for(int k = 1;k<=i-2;k++){
                    System.out.print(" ");
                }
            }
            for(int k =1;k<=10-(i*2);k++){
                System.out.print(" ");
            }
            //right hand side
            for(int j = 1;j<=2;j++){
                System.out.print("*");
                if(j==2)
                break;
                for(int k = 1;k<=i-2;k++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         //lower half 
        
           
        //left hand side
        //three to four
        for(int i = 5;i>=3;i--){
            for(int j = 1;j<=2;j++){
                System.out.print("*");
                if(j==2)
                break;
                for(int k = 1;k<=i-2;k++){
                    System.out.print(" ");
                }
            }
            for(int k =1;k<=10-(i*2);k++){
                System.out.print(" ");
            }
            //right hand side
            for(int j = 1;j<=2;j++){
                System.out.print("*");
                if(j==2)
                break;
                for(int k = 1;k<=i-2;k++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //left hand
        //only two
        for(int i =2;i>=1;i--){
            for(int  j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=10-(i*2);k++){
                System.out.print(" ");
            }
             //right hand side
            //only two
            for(int  j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
