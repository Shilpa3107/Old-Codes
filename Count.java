import java.util.*;
public class Count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cz=0,cp=0,cn=0;
         int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            int j = sc.nextInt();
            if(j==0)
             cz++;
            if(j>0)
            cp++;
            if(j<0)
            cn++;
        }
        System.out.println("Number of zeros : "+cz);
        System.out.println("Number of positive numbers : "+cp);
        System.out.println("Number of negative numbers : "+cn);
    }
}