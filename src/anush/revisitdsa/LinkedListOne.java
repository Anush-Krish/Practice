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

    private void addBeforeElement(int currElement, int newData) {
        if (null == head) { //case to handle if list is empty
            addFirst(newData);
        }
        Node prev = head;
        Node curr = head.next;
        Node newNode = new Node(newData);

        while (null != curr) {
            if (prev.data == currElement) {   // for handling case of, if insert position is head
                head = newNode;
                newNode.next = prev;
            }
            if (curr.data == currElement) {
                prev.next = newNode;
                newNode.next = curr;
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
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null ){
            if(fast.next.next == null){
                slow = slow.next;
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node rotateList(Node head,int k){
//        Node curr =head.next;
//        Node prev = head;
        while(k != 0 ){
            Node curr =head.next;
            Node prev = head;
            while (curr.next != null){

                curr =curr.next;
                prev = prev.next;
            }

            curr.next = head;
            head= curr;
            prev.next =null;
            k--;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListOne linkedList = new LinkedListOne();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addLast(50);
        linkedList.printList();
        System.out.println("Middle node->"+linkedList.middleNode(linkedList.head).data);
        // linkedList.findAndDeleteElement(50);
        linkedList.addBeforeElement(40, 15);
        linkedList.printList();
       // linkedList.rotateList(linkedList.head, 2);
        linkedList.printList();
        System.out.println("head node->"+linkedList.rotateList(linkedList.head,2).data);


    }
}
