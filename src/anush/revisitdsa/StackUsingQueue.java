package anush.revisitdsa;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
    static class MyStack {
        Queue queue = new ArrayDeque();
        Queue tempQueue = new ArrayDeque();

        public MyStack() {

        }

        public void push(int x) {
            queue.add(x);
        }

        public int pop() {
            while(queue.size()>1){
                tempQueue.add(queue.remove());
            }
            int element = (int) queue.remove();
            while (!tempQueue.isEmpty()){
                queue.add(tempQueue.remove());
            }
            return element;
        }

        public int top() {
            Integer element = null;
            while(!queue.isEmpty()) {
                element = (int) queue.remove();
                tempQueue.add(element);
            }
            while (!tempQueue.isEmpty()){
                queue.add(tempQueue.remove());
            }

            return element;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top(); // return 2
        myStack.pop(); // return 2
        myStack.empty(); // return False
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
