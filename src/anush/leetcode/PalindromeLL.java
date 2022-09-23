package anush.leetcode;



class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next=null;
    }
}

public class PalindromeLL {
    static ListNode head;
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        ListNode currListNode =head;
        while(currListNode !=null){

            System.out.print(currListNode.val+"-->");
            currListNode = currListNode.next;
        }
        System.out.println("NUll");
    }
    public static void addFirst(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void reverse(ListNode head){
        while(head==null||head.next==null){
            return;
        }
        ListNode prev,curr;
        prev=head;
        curr=head.next;

        while(curr.next!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;


    }
    public static boolean compare(ListNode head1, ListNode head2)
    {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val == temp2.val) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }

        /* Both are empty return 1*/
        if (temp1 == null && temp2 == null)
            return true;

		/* Will reach here when one is NULL
		and other is not */
        return false;
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode fast,slow,prev,secondHalf;
        fast=head;
        slow=head;
        prev=head;
        ListNode midNode=null;
        boolean res=true;

        if(head!=null&&head.next!=null){
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                prev=slow;
                slow=slow.next;
            }
            if(fast!=null){
                midNode=slow;
                slow=slow.next;
            }
            secondHalf=slow;

            prev.next=null;
            reverse(secondHalf);
            res=compare(head,secondHalf);
            reverse(secondHalf);
            if(midNode!=null){
                prev.next=midNode;
                midNode.next=secondHalf;
            }
            else
                prev.next=secondHalf;

        }
        return res;

    }

    public static void main(String[] args) {
        PalindromeLL list=new PalindromeLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        boolean h=isPalindrome(list.head);
        if(h!=false){
            System.out.println("p");
        }
        else
            System.out.println("n");
    }


}