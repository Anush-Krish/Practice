package anush.revisitdsa;

public class Stack {
    private static final int MAX = 10;
    private int top = -1;
    int[] arr = new int[MAX];

    private void push(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack overflow.");
        } else {
            top++;
            arr[top] = data;
            System.out.println("Pushed in stack: " + data);
        }
    }

    private void pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped element " + arr[top]);
        top--;
    }

    private void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("peek-> " + arr[top]);
    }

    private void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            int i = top;
            System.out.print("Stack-> ");
            while (i > -1) {
                System.out.print(arr[i] + " ");
                i--;
            }
            System.out.println(" ");
        }
    }

    private void stackEmptyOrFull() {
        if (top == -1) {
            System.out.println("Stack in empty.");

        } else if (top == MAX - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is neither full nor empty");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();
        stack.peek();
        stack.stackEmptyOrFull();

    }
}
