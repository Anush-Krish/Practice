package anush.dsaDPP;
//reverse linked list.
public class Dpp_LL {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

        public void addFirst(String data) {
            Node newNode = new Node(data);
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
        public void reverseList(){
        Node currNode=head.next;
        Node prevNode=head;
        if(head==null || head.next==null){
            return;
        }
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;

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
