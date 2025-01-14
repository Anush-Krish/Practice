package anush.revisitdsa;

public class DescPriorityQueue {
    private class Item {
        private int data;
        private int priority;

        public Item(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private Item[] arr;
    private final int max;

    private int size;

    public DescPriorityQueue(int capacity) {
        arr = new Item[capacity];
        max = capacity;
        size = 0;
    }

    private void enqueue(int data, int priority) {
        if (size == max) {
            System.out.println("Queue overflow");
            return;
        }
        Item item = new Item(data, priority);
        arr[++size] = item; //incrementing size and adding in the last element
        System.out.println("Item enqueued with data:" + data + " and priority:" + priority);

    }

    private int peek() {
        if (size == 0) {
            System.out.println("Empty queue.");
            return -1;
        }
        int idx = 0;//to store highest priority index
        int highestPriority = 0;
        int temp = size;
        while (temp > 0) {
            if (arr[temp].priority == highestPriority && arr[temp].data > arr[idx].data) { //condition for if priority
                idx = temp;                                                            //is same, then take bigger data
                highestPriority = arr[temp].priority;
            }
            if (arr[temp].priority > highestPriority) {
                idx = temp; //updating index with high priority index
                highestPriority = arr[temp].priority;
            }

            temp--;
        }
        return idx;
    }

    private void dequeue() {
        if (size == 0) {
            System.out.println("Queue underflow");
        }
        //get the top priority element's index
        int idx = peek();
        System.out.println("dequeued element: " + arr[idx].data);
        //search for the highest priority element then shift the others to left
        for (int i = idx; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    private void printPQueue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        }
        int temp = size;
        while (temp > 0) {
            System.out.print("(Data:" + arr[temp].data + ", Priority:" + arr[temp].priority + "), ");
            temp--;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        DescPriorityQueue priorityQueue = new DescPriorityQueue(10);
        priorityQueue.enqueue(10, 1);
        priorityQueue.enqueue(20, 2);
        priorityQueue.enqueue(30, 2);
        priorityQueue.enqueue(90, 8);
        priorityQueue.enqueue(40, 3);
        priorityQueue.enqueue(50, 8);
        priorityQueue.enqueue(60, 7);
        System.out.println(priorityQueue.peek());
        priorityQueue.dequeue();
        System.out.println(priorityQueue.peek());
        priorityQueue.printPQueue();
    }

}
