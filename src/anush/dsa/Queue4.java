package anush.dsa;
//implementation of queue using collection
import java.util.*;
public class Queue4 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();// Queue is interface, object can only be created of class.
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}