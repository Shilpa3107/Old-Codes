import java.util.*;
public class Skill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1;i<=T;i++){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int D = sc.nextInt();
		   // System.out.println(X-Y);
		    if((Math.abs(X-Y))<=D)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
    }
}
