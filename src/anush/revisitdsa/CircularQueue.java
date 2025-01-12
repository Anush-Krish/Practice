package anush.revisitdsa;

public class CircularQueue {
    private int size;
    private int front;
    private final int max;
    private int[] arr;

    public CircularQueue(int capacity) {
        max = capacity;
        arr = new int[max];
        size = 0;
        front = 0;
    }

    private void enqueue(int data) {
        if (size == max) {
            System.out.println("Queue overflow.");
            return;
        }
        int rear = (front + size++) % max; //also post incrementing size
        arr[rear] = data;
        System.out.println("Enqueued item in queue: " + data);
    }

    private void dequeue() {
        if (size == 0) {
            System.out.println("Queue underflow.");
            return;
        }
        System.out.println("Item dequeued: " + arr[front]);
        front = (front + 1) % max;
        size--;
    }

    private int getRear() {
        if (size == 0) {
            return -1;
        }
        return (front + size - 1) % max;
    }

    private void printCQueue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        int temp = front;
        System.out.print("Circular Queue: " + arr[front]); //for printing front since after this
        while (temp != getRear()) {                        //in while loop , we are printing the updated front
            temp = (temp + 1) % max;
            System.out.print(" " + arr[temp]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(10);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.printCQueue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.enqueue(60);
//        circularQueue.getRear();
//        circularQueue.dequeue();
        circularQueue.printCQueue();
    }


}
