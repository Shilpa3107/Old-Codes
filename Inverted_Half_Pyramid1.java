public class Inverted_Half_Pyramid1 {
    public static void main(String args[]){
        int  l =4;
        //outer loop
        for(int i = 1;i<5;i++){
            for(int j = 0;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j = i;j<5;j++){
System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
