package anush.dsa;
//implementation of stack using Linked list.
public class Stack1 {
    static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);


        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
