package anush.dsaDPP;
//recursive reverse of linked list.
public class Dpp_ll1 {
    class Node{
        Node head;
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        public void addFirst(int data){
            Node newNode=new Node(data);
            if (head == null) {
                head = newNode;
                return;

            }
            newNode.next = head;
            head = newNode;
        }
        public void printList() {
            if (head == null) {
                System.out.println("List Empty!");
                return;
            }
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "-->");
                currNode = currNode.next;
            }
            System.out.println("NULL");

        }
        public Node reverseList(){
        Node currNode=head.next;
        Node prevNode=head;
        if(currNode.next==null){
            return head;
        }
        Node nextNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=nextNode;
        reverseList();
        head.next=null;
        head=prevNode;
        return head;
        }
    }
    public static void main(String[] args) {
        Dpp_LL ll = new Dpp_LL();
        ll.addFirst("List");
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.printList();
        ll.reverseList();



        ll.printList();
    }

}

