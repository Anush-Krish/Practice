package anush.dsa;
//iterative reverse linked list.


class Node {

    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class LL4 {
    Node head;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){

            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("NUll");
    }
     public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node currNode=head.next;
        Node prevNode=head;

        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;


        }
        head.next=null;
        head=prevNode;




    }
    public static void main(String[] args) {
        LL4 list = new LL4();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        list.reverseList();
        list.printList();


    }

}
