package anush.revisitdsa;

public class LinkedListOne {
    Node head;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (null == head) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    private void addLast(int data) {
        Node lastNode = new Node(data);
        if (null == head) {
            head = lastNode;
        }
        Node temp = head;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = lastNode;

    }

    private void findAndDeleteElement(int data) {
        Node curr = head.next;
        Node prev = head;

        while (null != prev) {
            //if deletion data is found
            if (prev.data == data) {
                if (null == head.next) {       //if one element exist
                    head = null;
                    break;
                } else if (prev == head) {     // if the deletion element is head
                    head = curr;
                    break;
                }
            } else if (curr.data == data) {
                //if any middle element
                prev.next = curr.next;
            }
            prev = prev.next;
            curr = curr.next;

        }
    }

    private void printList() {
        if (null == head) {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while (null != temp) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListOne linkedList = new LinkedListOne();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addLast(50);
        linkedList.printList();
        linkedList.findAndDeleteElement(50);
        linkedList.printList();

    }
}
