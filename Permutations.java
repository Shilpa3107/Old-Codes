import java.util.*;
public class Permutations {
    public static void printPerm(String str, String permuation){
        if(str.length()==0){
        System.out.println(permuation);
        return;
    }
        for(int i =0;i<str.length();i++){
            char current = str.charAt(i);
            //"abc" => "ab" or "ac"
            String newstr = str.substring(0,i)+str.substring(i+1);
            printPerm(newstr, permuation+current);
        }
    }
    public static void main(String args[]){
      String str = "abc";
      printPerm(str, "");
    }
}
