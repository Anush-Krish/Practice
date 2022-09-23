package anush.dsa;
//remove nth node from last.

public class LL7 {
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
    public int sizeList(){
        int size=0;
        if (head==null){
             return size;
        }

        ListNode currListNode =head;
        while(currListNode !=null){
            size++;
            currListNode = currListNode.next;


        }
        return size;
    }


    public ListNode removeNth(ListNode head, int n){
        if (head.next==null){
            return null;
        }
        ListNode currListNode =head;
        int i=1;
        if(i==sizeList()){
            return head.next;
        }
        while(i<sizeList()-n){
            currListNode = currListNode.next;
            i++;
        }
        currListNode.next= currListNode.next.next;

        return head;

    }


    public static void main(String[] args) {
        LL7 list = new LL7();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();
        list.removeNth(list.head,3);
        list.printList();

    }


}
