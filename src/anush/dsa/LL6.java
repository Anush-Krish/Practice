package anush.dsa;

//Swap adjacent elements.
//class Node is used from LL4.
public class LL6 {
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

    public Node swapAdjacent(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node currNode = head;
        Node nextNode = currNode.next;
        boolean flag = false;
        while ( nextNode != null ) {

            if(flag == true){
                currNode = currNode.next;
                nextNode = nextNode.next;
                flag = false;
            }
            Node temp = currNode;
            nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = temp;
            currNode = currNode.next;
            head = nextNode;

            /*Node temp = currNode.next.next;
            currNode.next.next = currNode;
            currNode.next = temp;*/

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
