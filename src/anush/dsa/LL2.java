package anush.dsa;

class LL2{
    Node head;
    int size=0;
    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
            size++;

        }
    }



        public void addFirst(String data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;

            }
            newNode.next=head;
            head=newNode;

        }
        public void addlast(String data){
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
    public void printList(){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        Node currNode=head;
        while(currNode!=null){

            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        size--;

        head=head.next;

    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;

        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;



    }
    public int printSize(){
        if(head==null){
            System.out.println("List is empty.");

        }
        return size;
    }



    public void addMiddle(int index,String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(head.next==null){
            newNode.next=head;
        }
        Node currNode=head.next;
        Node pNode=head;
        int i=1;
        while(i!=index){
            currNode=currNode.next;
            pNode=pNode.next;
            i++;
        }
        pNode.next=newNode;
        newNode.next=currNode;


    }


        public static void main(String[] args) {
            LL2 list = new LL2();
            list.addFirst("a");
            list.addFirst("is");
            list.printList();

            list.addlast("list");
            list.addFirst("This");
            list.printList();
//        int a=list.printSize();
//        list.deleteFirst();
//
//        list.printList();
//     System.out.println(list.printSize());
//        list.deleteLast();
//        list.printList();
//
//      System.out.println(list.printSize());
            list.addMiddle(1, "the");
            list.printList();
        }
    }




