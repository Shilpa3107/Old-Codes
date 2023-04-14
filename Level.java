import java.util.*;
public class Level {
    public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int i=1;i<=T;i++){
		    int X= sc.nextInt();
		    int Y= sc.nextInt();
		    int Z= sc.nextInt();
		    if(X<=3)
		    System.out.println(X*Y);
		    else{
                int t=0,p=0;
		        while(X>3){
		            X=X-3;
		            t = t+(Y*3);
                    p = p+Z;
		         }
		        if(X==0)
		        System.out.println(t+p);
		        else
		        System.out.println(t+p+(X*Y));
		    }
		   }
	}
}