public class Hollow_Rectangle1 {
    public static void main(String args[]){
//outer loop
for(int i = 1;i<5;i++){
    //inner loop
    for(int j = 1;j<6;j++){
        if(i==1||j==1||i==4||j==5){
            System.out.print("*");
        }else{
         System.out.print(" ");
        }
    }
    System.out.println();
}
    }
    
}
