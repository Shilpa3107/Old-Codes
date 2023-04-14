import java.util.*;
public class CardRemoval {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test cases
        
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int max =0;
            int a[] = new int[n];
            for(int j =0;j<n;j++){
                a[j] = sc.nextInt();
            }
            for(int j =0;j<n;j++){
               int count =1;
               for(int k = j+1;k<n;k++){
                if(a[j]==a[k])
                count++;
               }
               if(count>max)
               max = count;
            }
           System.out.println(n-max);

        }

    }
}
