package anush.dsa;
//iterative reverse linked list.


class ListNode {

    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }

}
public class LL4 {
    ListNode head;

    public void addFirst(int data){
        ListNode newListNode =new ListNode(data);
        if(head==null){
            head= newListNode;
            return;
        }
        newListNode.next=head;
        head= newListNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        ListNode currListNode =head;
        while(currListNode !=null){

            System.out.print(currListNode.data+"-->");
            currListNode = currListNode.next;
        }
        System.out.println("NUll");
    }
     public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        ListNode currListNode =head.next;
        ListNode prevListNode =head;

        while(currListNode !=null){
            ListNode nextListNode = currListNode.next;
            currListNode.next= prevListNode;
            prevListNode = currListNode;
            currListNode = nextListNode;


        }
        head.next=null;
        head= prevListNode;




    }
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.reverseList();
        list.printList();


    }

}
