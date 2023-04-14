public class Recur11 {
    public static void main(String args[]){
        String s = "axbcxxd";
        printrecur(s,0,0," ");
    }
    public static void printrecur(String s,int c ,int ind,String k){
        if(ind==s.length()){
            for(int i =0;i<c;i++){
                k = k+'x';
            }
           System.out.println(k);
            return;
        }
        char ch = s.charAt(ind);
        if(ch=='x'){
            c++;
            printrecur(s,c,ind+1,k);
        }
        else{
            k = k+ch;
            printrecur(s, c, ind+1, k);
        
        }
    }
}
