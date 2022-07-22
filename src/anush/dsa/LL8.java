package anush.dsa;
//palindrome linked list.
public class LL8 {
    Node head;
    public void addLast(int data){
        Node newNode=new Node(data);
        Node currNode=head;
        if(head==null){
            head=newNode;
        }
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is Empty.");
        }
        Node currNode=head;
        while(currNode!=null){
            currNode=currNode.next;
        }
    }
    public int getSize(){
        int size=0;
        if(head==null){
            return size;
        }
        Node currNode=head;
        while(currNode!=null){
            size++;
            currNode=currNode.next;

        }
        return size;
    }
    public void isPalindrome(){
        if(head==null){
            System.out.println("List is Empty");
        }
        if(head.next==null){
            System.out.println("Palindrome");
        }

    }
    public void main(String[] args){
        LL8 list = new LL8();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
    }
}
