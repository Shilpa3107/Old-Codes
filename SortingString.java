import java.util.*;
public class SortingString{
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
	int t= sc.nextInt();
	int c1=0,c2=0,l=0;
	while(t-->0){
	    String s = sc.next();
	    int n = sc.nextInt();
	    while(n-->0){
        String w = sc.next();
        for(int i =0;i<w.length();i++){
            if(w.charAt(i)==s.charAt(l)){
                c1++;
                l++;
            }
            else
            c2++;
        }
        if(c2==0)
        System.out.println("Yes");
        else
        System.out.println("No");
	    }
	}
	}
}