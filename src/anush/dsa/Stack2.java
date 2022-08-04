package anush.dsa;

import java.util.ArrayList;

//implementation of stack using array list.
public class Stack2 {
    static class Stack{
        ArrayList<Integer> ar=new ArrayList<>();
        public void push(int data){
            ar.add(0,data);
        }
        public int pop(){
            int top=ar.get(0);
            ar.remove(0);
            return top;
        }
        public int peek(){
            int top=ar.get(0);
            return top;
        }


    }

    public static void main(String[] args) {
        Stack1.Stack st=new Stack1.Stack();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.pop();

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
