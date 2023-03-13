package anush.dsaDPP;
//reverse LL

public class Dpp_LL {

  Node head;
  public class Node{
      String data;
      Node next;


      Node(String data){
          this.data=data;
          this.next=null;
      }
      public void addFirst(String data){
           Node newNode= new Node(data);
           if(head==null){
               head=newNode;
               return;
           }
           newNode.next=head;
           head=newNode;

      }
      public void printList(){
          Node currNode=head;
          if(head==null){
              System.out.println("List is empty.");
          }
          while(currNode!=null){
              System.out.println(currNode.data+" --> ");
              
          }

      }

  }
}
