public class LL {
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add first
    public void addfirst(String d){
        Node newnode = new Node(d);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        
    }
    //addlast
    public void addlast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
        
    }
    //delete first
    public void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        
    }
    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next;
        while(lastnode.next!=null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
    public void printlist(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }
    public int getsize(){
        return size;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("This");
        list.addlast("list");
        list.printlist();
        System.out.println(list.getsize());

        list.deletefirst();
        list.printlist();
        System.out.println(list.getsize());
        
        list.deletelast();
        list.printlist();
        System.out.println(list.getsize());
    }
}
