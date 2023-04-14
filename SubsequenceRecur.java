public class SubsequenceRecur {
    public static void main(String args[]){
        String s = "abc";
        String m =" ";
        subsequences(s, 0, m);
    }
    public static void subsequences(String s, int idx, String k){
        if(idx==s.length()){
            System.out.println(k);
            return;
        }

        char ch = s.charAt(idx);
        //to be
         subsequences(s, idx+1, k+ch);
        //not to be
        subsequences(s, idx+1, k);
    }
}
