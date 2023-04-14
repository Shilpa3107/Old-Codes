import java.util.HashSet;
public class Keypadcombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String args[]){
       String s = "23";
       printkey(s, 0, " ");
    }
    public static void printkey(String s , int idx, String c){
        if(idx==s.length()){
            System.out.println(c);
            return;
        }
        char ch = s.charAt(idx);
        String map = keypad[ch-'0'];
        for(int i =0;i<map.length();i++){
            printkey(s, idx+1, c+map.charAt(i));
        }
    }//time complexity O(4^n) where 4 is the maximum choices
    // and n is the length of a string
}
