package anush.dsa;
//recursive reversed list. class node is being used by LL4.

public class LL5 {
    ListNode head;
    public ListNode reverseList(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty.");
        }
        ListNode currListNode =head;
        while(currListNode !=null){
            System.out.print(currListNode.data+"-->");
            currListNode = currListNode.next;
        }
        System.out.println("NULL");
    }
    public void addLast(int data){
        ListNode newListNode =new ListNode(data);
        if(head==null){
            head= newListNode;
            return;
        }
        ListNode currListNode =head;
        while(currListNode.next!=null){
            currListNode = currListNode.next;
        }
        currListNode.next= newListNode;

    }


    public static void main(String[] args){
        LL5 list=new LL5();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.reverseList(list.head);
        list.printList();




    }


}
