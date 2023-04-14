import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String declarartion
        String name = sc.nextLine();
        System.out.println("Name : "+name);
        //Concatenation
        String firstname = "Shilpa";
        String lastname = "Sinha";
        String fullname = firstname+" "+lastname;
        System.out.println(fullname);
        //length of string
        System.out.println(fullname.length());
        //charAt
        for(int i =0;i<fullname.length();i++){
           System.out.println(fullname.charAt(i));
        }
        //compare
        String name1 = "Shilpa";
        String name2 = "Shilpa";
            if(name1.compareTo(name2)==0)
           System.out.println("Strings are equal");
           else
           System.out.println("Strings are not equal");
           //substring
           String sentence = "ShilpaSinha";
           String name12 = sentence.substring(6);
           System.out.println(name12);
           //converting integer to string
           int c = 123;
           String str = Integer.toString(c);
           System.out.println(str);
           //converting string to integer
           int k = Integer.parseInt(str);
           System.out.println(k);
    }
}
