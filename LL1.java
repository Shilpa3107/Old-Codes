import java.util.*;
public class LL1{
    public static void main(String args[]){
        LinkedList <String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        //size
        System.out.println(list.size());

        //search element 
        for(int i = 0;i<list.size();i++){
            if(list.get(i) == "a")
            System.out.println("Present");
        }
        
        //to delete any element
        list.remove(1);
        System.out.println(list);
        
        //for printing
        for(int i= 0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");

    }
}
