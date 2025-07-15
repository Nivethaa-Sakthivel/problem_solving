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
            Node node=new Node(data);
            node.next=null;
            if(head==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
        public void insertatbig(int data){
            Node node=new Node(data);
            node.next=head;
            head=node;
        }
        public void insertatpos(int pos,int data){
            Node node=new Node(data);
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            temp=temp.next;
            node.next=temp.next;
            temp.next=node;
        }
        public void display(){
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        public void deleteatbig(){
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        public void deleteatpos(int pos,int data){
            Node temp=head;
            for(int i=0;i<pos-1;i++)
            temp=temp.next;
            temp.next=temp.next.next;
        }
        public void deleteatend(){
            Node temp=head;
            while(temp.next!=tail)
                temp=temp.next;
                temp.next=null;
                tail=temp;
                
            
        }
    }
    public static void main(String[] args){
        List n=new List();
        n.insert(10);
        n.insert(20);
        n.insert(30);
        n.insertatbig(5);
        n.insertatpos(2,15);
        n.display();
        System.out.println("After deletetion---->Deletion at Beginning:");
        n.deleteatbig();
        n.display();
        System.out.println("Deletion at position:");
        n.deleteatpos(2,20);
        n.display();
        System.out.println("Deletion at end:");
        n.deleteatend();
        n.display();
    }
}
