public class Recur12 {
    public static boolean[] map = new boolean[26];
    public static void main(String args[]){
        String s = "abbccda";
        String m =" ";
        removedupli(s, 0,m);
    }
        public static void removedupli(String s,int idx, String k){
            if(idx==s.length()){
                System.out.println(k);
                return;
            }
            char ch = s.charAt(idx);
            if(map[ch-'a']==true)
              removedupli(s, idx+1, k);
            else{
             k = k+ch;
             map[ch-'a']=true;
             removedupli(s, idx+1, k);
            }

        }
}

