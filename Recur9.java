public class Recur9 {
    static int f = -1,l=-1;
    public static void main(String args[]){
     String s = "abaacdaefaah";
     char ch = 'a';
     printrecur(s,ch,0);
    //  int l1 = s.indexOf(ch);
    //  int l2 = s.lastIndexOf(ch);
    //  System.out.println(l1+" "+l2);
    }
    public static void printrecur(String s,char ch , int ind){
        if(ind==s.length()){
        System.out.println(f+" "+l);
        return ;
        }
      char a = s.charAt(ind);
      if(a==ch){
      if(f==-1){
      f = ind;
      }
      else{
      l = ind;
      }
    }
     printrecur(s,ch,ind+1);
    }
}
