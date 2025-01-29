package anush.revisitdsa;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    int count;
    Queue<Integer> queue;

    public RecentCounter() {
        count = 0;
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        count++;
        int rangeStart = t-3000;
        int rangeEnd = t;
        while (null != queue.peek() && queue.peek()<rangeStart && queue.peek()<=rangeEnd){
            queue.remove();
            count--;
        }
        return count;
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        recentCounter.ping(100);
        recentCounter.ping(3001);
        recentCounter.ping(3002);
    }
}
