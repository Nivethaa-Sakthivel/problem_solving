      public class SingleLinkedList {
static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
 static class List{
    Node head,tail;
    public void insert(int data){
        Node n=new Node(data);
        n.next=null;
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
            
        }
        System.out.println(temp.data);
    }
}

    public static void main(String[] args){
        List i= new List();
        i.insert(10);
        i.insert(20);
        i.insert(30);
        
        i.display();
    }
}
