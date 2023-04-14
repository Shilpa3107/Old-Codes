import java.util.*;
public class Matches {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int k =0;
        for(int i =1;i<=T;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A+B;
            while(sum>0){
            int dig = sum%10;
            System.out.println("Digit : "+dig);
            switch(dig){
                case 0 : k+= 6;
                break;
                case 1 : k+= 2;
                break;
                case 2 : k+= 5;
                break;
                case 3 : k+= 5;
                break;
                case 4 : k+= 4;
                break;
                case 5 : k+= 5;
                break;
                case 6 : k+= 6;
                break;
                case 7 : k+= 3;
                break;
                case 8 : k+= 7;
                break;
                case 9 : k+= 6;
            }
            sum= sum/10;
        }
            System.out.println("Number of matchsticks : "+k);
        }
    }
}
