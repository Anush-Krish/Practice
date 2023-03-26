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
            
        }
    }

}

