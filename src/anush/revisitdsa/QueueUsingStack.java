package anush.revisitdsa;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    static class MyQueue {
        Stack stack = new Stack();
        Stack tempStack = new Stack();

        public MyQueue() {

        }

        public void push(int x) {
            stack.push(x);
        }

        public int pop() {
            while (!stack.isEmpty()) {
                tempStack.push(stack.pop());
            }
            int element = (int) tempStack.pop();
            while (!tempStack.empty()) {
                stack.push(tempStack.pop());
            }
            return element;
        }

        public int peek() {
            while (!stack.isEmpty()) {
                tempStack.push(stack.pop());
            }
            int element = (int) tempStack.peek();
            while (!tempStack.empty()) {
                stack.push(tempStack.pop());
            }
            return element;
        }

        public boolean empty() {
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
