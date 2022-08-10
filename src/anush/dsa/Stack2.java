package anush.dsa;

import java.util.*;

//implementation of stack using array list.
public class Stack2 {
    static class Stack{
        ArrayList<Integer> ar=new ArrayList<>();
        public boolean isEmpty(){
            if(ar.isEmpty()){
                return true;

            }
            return false;
        }
        public void push(int data){
            ar.add(0,data);
        }
        public int pop(){
            if (ar.isEmpty()){
                return -1;
            }
            int top=ar.get(0);
            ar.remove(0);
            return top;
        }
        public int peek(){
            if(ar.isEmpty()){
                return -1;
            }
            int top=ar.get(0);
            return top;
        }


    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);


        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
