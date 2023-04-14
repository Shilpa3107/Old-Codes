import java.util.*;
public class Equivalent1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int  p=0;
		while(T>0){
            int  A= sc.nextInt();
            int B = sc.nextInt();
            for(int j =1;j<=20;j++){
                for(int k =1;k<=20;k++)
                if(Math.pow(A,j)==Math.pow(B,k))
                p++;
            }
           if(p>0)
            System.out.println("Yes");
            else
            System.out.println("No");
            p=0;
            T--;
        }
    }
}
