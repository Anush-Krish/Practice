package anush.dsa;

class LL1 {
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
            Node NewNode = new Node(data);
            if (head == null) {
                head = NewNode;
                return;

            }
            NewNode.next = head;
            head = NewNode;
        }

        public void addlast(String data) {
            Node NewNode = new Node(data);
            if (head == null) {
                head = NewNode;
                return;

            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;


            }
            currNode.next = NewNode;

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



    public static void main(String[] args){
            LL1 list=new LL1();
            list.addFirst("a");
            list.addFirst("is");
            list.printList();
            list.addlast("List");
            list.printList();

    }



}
