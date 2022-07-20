package anush.dsa;
//remove nth node from last.

public class LL7 {
    private Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }


    public void printList() {
        if (head == null) {
            System.out.println("list is empty.");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public int sizeList(){
        int size=0;
        if (head==null){
             return size;
        }

        Node currNode=head;
        while(currNode!=null){
            size++;
            currNode=currNode.next;


        }
        return size;
    }


    public Node removeNth(Node head,int n){
        if (head.next==null){
            return null;
        }
        Node currNode=head;
        int i=1;
        if(i==sizeList()){
            return head.next;
        }
        while(i<sizeList()-n){
            currNode=currNode.next;
            i++;
        }
        currNode.next=currNode.next.next;

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
