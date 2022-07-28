package anush.dsa;

//palindrome linked list.
public class LL8 {
    Node head;

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
            System.out.println("List is Empty.");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        int size = 0;
        if (head == null) {
            return size;
        }
        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;

        }
        return size;
    }



    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public Node reverse(Node head) {

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

        }

        return prevNode;
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node middle = findMiddle(head);
        Node secondStart = reverse(middle.next);
        Node firstStart = head;
        while (secondStart != null) {
            if (firstStart.data != secondStart.data) {
                return false;
            }

            firstStart = firstStart.next;
            secondStart = secondStart.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LL8 list = new LL8();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        //list.addLast(5);
        list.printList();
        boolean flag = list.isPalindrome(list.head);
        if (flag == true) {
            System.out.println("palindrome");


        } else {
            System.out.println("Not a palindrome");
        }
    }
}

