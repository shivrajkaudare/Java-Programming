package Collections.Queue;
// Priority Queue is used when the objects when the objects are supposed to be processed based on priority.
// it does not permits null elements.
// we can not create priority queue of elements.
// non-synchronised and not thread safe.
// time complexity for add and poll(remove first) elements is O(log(n)).

import java.util.*;
public class PriorityQueueEx{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        System.out.println(pq);

        // find the top element of priority queue.
        System.out.println(pq.peek());

        // remove top element of priority queue.

        System.out.println(pq.poll());
    }
}
