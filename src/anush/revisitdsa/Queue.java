package anush.revisitdsa;

public class Queue {
    private int head = -1;
    private int tail = -1;

    private static final int MAX = 10;

    int[] arrQueue = new int[MAX];

    private void enqueue(int data) {  // case of overflow
        if (tail == MAX - 1) {
            System.out.println("Queue overflow.");
            return;
        }
        if (head == -1 && tail == -1) {   //case for 1st element
            head++;
            arrQueue[++tail] = data;
            System.out.println("First element enqueued: " + data);
            return;
        }
        arrQueue[++tail] = data;
        System.out.println("Enqueue: " + data);
    }

    private void dequeue() {
        if (head == -1) {
            System.out.println("Queue underflow.");
            return;
        }
        int temp = head;
        System.out.println("Dequeued item " + arrQueue[head]);
        while (temp < tail) {
            arrQueue[temp] = arrQueue[temp + 1];
            temp++;
        }
        tail--;
        if (tail == -1) { //update head to -1 , when queue is empty
            head = -1;
        }
    }

    private void printQueue() {
        if (tail == -1) {
            System.out.println("Empty Queue.");
            return;
        }
        System.out.print("Queue--> ");
        int temp = tail;
        while (temp > -1) {
            System.out.print(arrQueue[temp--] + " ");
        }
        System.out.println(" ");
    }

    private void isQueueEmptyOrFull() {
        if (head == -1) {
            System.out.println("Queue is empty");
        } else if (tail == MAX - 1) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue is neither full nor empty");
        }
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        queue.enqueue(70);
//        queue.enqueue(80);
//        queue.enqueue(90);
//        queue.enqueue(100);
        queue.printQueue();
        queue.dequeue();

        queue.printQueue();
        queue.isQueueEmptyOrFull();

    }
}
