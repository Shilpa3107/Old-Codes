import java.util.*;
public class Expert{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
	    for(int i =1;i<=T;i++){
	        int X = sc.nextInt();
	        int Y = sc.nextInt();
	        int k =(int) ((Y*100)/X);
            System.out.println(k);
	        if(k>=50)
	        System.out.println("Yes");
	        else if(k<50)
	        System.out.println("No");
	    }
    }
}
