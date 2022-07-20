package anush.dsa;
//recursive reversed list. class node is being used by LL4.

public class LL5 {
    Node head;
    public Node reverseList(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty.");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }


    public static void main(String[] args){
        LL5 list=new LL5();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();




    }


}
