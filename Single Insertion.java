public class Single{
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
            }else{
                tail.next=n;
                tail=n;
            }
        }
        public void display(){
            if(head==null){
                System.out.println("Empty List");
            }
            else{
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public void insertatbegin(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertatpos(int pos,int data){
        Node n=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++)
                temp=temp.next;
            n.next=temp.next;
            temp.next=n;
        
    }
}
    public static void main(String[] args){
        List obj=new List();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        
        obj.insertatbegin(8);
        obj.insertatpos(5,22);
        
        obj.display();
    }
}
