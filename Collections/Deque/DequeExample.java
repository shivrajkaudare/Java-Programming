package Collections.Deque;

//Subtype of queue interface.
// Deque is related to double ended queue.
// it supports adding or removing elements from both end.
// it can be used as queue(FIFO) or stack(LIFO).

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeExample {
    public static void main(String[] args) {
       
        Deque<String> d1 = new ArrayDeque<>();

      // Adding elements in  Deque.
        d1.addFirst("Shiv");
        d1.addLast("Raj");

        System.out.println(d1);

      // Removing elements from Deque.

      String first = d1.removeFirst();
      String second = d1.removeLast();

       System.out.println(first);
       System.out.println(second);
        
    }
    
}
