public class Palindromic_number_pyramid {
    public static void main(String args[]){
        int rev = 0,temp=0;
        for(int i = 1;i<6;i++){
            //space print
           for(int k = 4;k>=i;k--){
                System.out.print(" ");
            }
           for(int j =1;j<=i;j++){
            temp = j;
            } for(rev = (rev*10)+temp;rev>0;rev--){
            System.out.print(rev);
           }
           for(int j =2;j<=i;j++){
            System.out.print(j);
           }
            System.out.println();
        }
    }

}
