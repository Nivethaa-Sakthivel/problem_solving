import java.util.*;
class Main{
    static class ListNode{
        int val;
        ListNode next;
        
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
    public static ListNode createList(int n){
        Scanner sc=new Scanner(System.in);
        ListNode head=null;
        ListNode tail=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
        
        ListNode newnode=new ListNode(val);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    return head;
}
    public static ListNode merge(ListNode list1,ListNode list2){
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=merge(list1.next,list2);
                return list1;
            }
            else{
                list2.next=merge(list1,list2.next);
                return list2;
            }
        }
        if(list1==null){
            return list2;
        }else{
            return list1;
        }
    }
    public static void printList(ListNode head){
        while(head!=null){
          System.out.print(head.val+" ");
          head=head.next;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n1=sc.nextInt();
        ListNode list1 = createList(n1);
        
        int n2=sc.nextInt();
        ListNode list2 = createList(n2);
        
        ListNode result= merge(list1,list2);
        
        printList(result);
    }
}
