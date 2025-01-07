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
        Node temp = head;
        while (null != temp) {
            //if deletion data is found
            if (temp.data == data) {
                if (null == temp.next) { //if one element exist
                    head = null;
                }
                if (temp == head) {     // if the deletion element is head
                    temp.next=head;
                }
                if(temp )
                temp = temp.next;

            }
        }

        private void printList () {
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

        public static void main (String[]args){
            LinkedListOne linkedList = new LinkedListOne();
            linkedList.addFirst(10);
            linkedList.addFirst(20);
            linkedList.addLast(30);
            linkedList.printList();
        }
    }
