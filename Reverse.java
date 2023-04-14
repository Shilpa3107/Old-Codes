import java.util.*;
public class Reverse{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");
        for(int i =0;i<sb.length()/2;i++){
            sb.setcharAt(i,sb.charAt(sb.length()-1-i));
            sb.setCharAt((sb.length()-1-i),sb.charAt(i));
        }
        System.out.println(sb);
    }
}

