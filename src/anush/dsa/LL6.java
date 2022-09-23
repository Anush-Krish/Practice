package anush.dsa;

//Swap adjacent elements.
//class Node is used from LL4.
public class LL6 {
    private ListNode head;

    public void addLast(int data) {
        ListNode newListNode = new ListNode(data);
        if (head == null) {
            head = newListNode;
            return;
        }
        ListNode currListNode = head;
        while (currListNode.next != null) {
            currListNode = currListNode.next;
        }
        currListNode.next = newListNode;

    }


    public void printList() {
        if (head == null) {
            System.out.println("list is empty.");
        }
        ListNode currListNode = head;
        while (currListNode != null) {
            System.out.print(currListNode.data + "-->");
            currListNode = currListNode.next;
        }
        System.out.println("NULL");
    }

    public ListNode swapAdjacent(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode currListNode = head.next;
        ListNode prevListNode =head;

        while ( currListNode != null ) {



            ListNode temp = currListNode.next;
            temp= currListNode.next;
            prevListNode = currListNode.next;
            prevListNode.next=temp;
            currListNode.next.next= currListNode;
            prevListNode.next= prevListNode;





        }
        return head;


    }

    public static void main(String[] args) {
        LL6 list = new LL6();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.swapAdjacent(list.head);
        list.printList();
    }
}
