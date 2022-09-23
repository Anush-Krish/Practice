package anush.dsa;

//palindrome linked list.
public class LL8 {
    ListNode head;

    public void addLast(int data) {
        ListNode newListNode = new ListNode(data);

        if (head == null) {
            head = newListNode;
            return;
        }
        ListNode currListNode = head;
        while (currListNode.next != null) {
            currListNode = currListNode.next;
        }
        currListNode.next = newListNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty.");
        }
        ListNode currListNode = head;
        while (currListNode != null) {
            System.out.print(currListNode.data + "-->");
            currListNode = currListNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        int size = 0;
        if (head == null) {
            return size;
        }
        ListNode currListNode = head;
        while (currListNode != null) {
            size++;
            currListNode = currListNode.next;

        }
        return size;
    }



    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public ListNode reverse(ListNode head) {

        ListNode prevListNode = null;
        ListNode currListNode = head;
        while (currListNode != null) {
            ListNode nextListNode = currListNode.next;
            currListNode.next = prevListNode;
            prevListNode = currListNode;
            currListNode = nextListNode;

        }

        return prevListNode;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondStart = reverse(middle.next);
        ListNode firstStart = head;
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

