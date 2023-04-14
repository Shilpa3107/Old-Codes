import java.util.HashSet;

public class UniqueSubsequenceRecur {
    boolean arr[] = new boolean[26];
    public static void main(String args[]){
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesub(s, 0, " ",set);
    }
    public static void uniquesub(String s,int idx,String k, HashSet<String> set){
        if(idx==s.length()){
            if(set.contains(k)){
                return;
            }
            else
            {
                System.out.println(k);
                set.add(k);
                return;
            }
          }

        char ch = s.charAt(idx);
        // to be
        uniquesub(s, idx+1, k+ch,set);

        // not to be
        uniquesub(s, idx+1, k,set);
    }
}
