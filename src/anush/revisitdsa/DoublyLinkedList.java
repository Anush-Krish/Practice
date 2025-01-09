package anush.revisitdsa;

public class DoublyLinkedList {
    Node head;

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (null == head) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    private void addLast(Node tail, int data) {
        Node newNode = new Node(data);
        if (null == head) {
            head = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
    }

    private void printList() {
        if (null == head) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (null != temp) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    private void reversePrintList(Node tail) {
        if (null == tail) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("ReverseList->   ");
        Node temp = tail;
        while (null != temp) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    private void findAndDeleteElement(int data) {
        Node temp = head;
        while (null != temp) {
            if (temp.data == data) {
                if (null == head.next) {     //if delete node is only node
                    head = null;
                    break;
                } else if (temp == head) {  //if delete element is head
                    head = temp.next;
                    temp.prev = null;
                } else if (null == temp.next) {  // if delete node is last node
                    temp.prev.next = null;
                } else {
                    temp.prev.next = temp.next;  // for deleting any middle node
                    temp.next.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(10);
        doublyLinkedList.addFirst(20);
        doublyLinkedList.addFirst(30);
       // doublyLinkedList.addFirst(40);
//        doublyLinkedList.addLast(getTailNode(doublyLinkedList.head), 40);
//        doublyLinkedList.addLast(getTailNode(doublyLinkedList.head), 50);
//
//        doublyLinkedList.printList();
//        doublyLinkedList.reversePrintList(getTailNode(doublyLinkedList.head));
        doublyLinkedList.printList();
        doublyLinkedList.findAndDeleteElement(10);
        doublyLinkedList.printList();

    }

    private static Node getTailNode(Node temp) {
        if (null == temp) {
            System.out.println("List is empty");
            return null;
        }
        while (null != temp.next) {
            temp = temp.next;
        }
        return temp;
    }
}
