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
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                tail=n;
            }
        }
        public void insertatbig(int data){
            Node n=new Node(data);
            n.next=head;
            head=n;
        }
        public void insertatpos(int pos,int data){
            Node temp=head;
            Node n=new Node(data);
            for(int i=0;i<pos-1;i++)
            temp=temp.next;
            n.next=temp.next;
            temp.next=n;
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
            
            head=head.next;
           
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
        public void reverse(){
            Node prev=null;
            Node curr=head;
            Node next=null;
            tail=head;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
    }

    public static void main(String[] args){
        List l=new List();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insertatbig(5);
        l.insertatpos(2,15);
        
        l.display();
        System.out.println("Deletion Big:");
        l.deleteatbig();
        l.display();
        System.out.println("Deletion pos:");
        l.deleteatpos(2,20);
        l.display();
         System.out.println("Deletion end:");
        l.deleteatend();
        l.display();
        System.out.println("Reverse:");
        l.reverse();
        l.display();
    }
}
