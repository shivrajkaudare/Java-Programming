package Collections.Deque;
// Array Deque is more convinient way for implementing Queue interface than linked list.
// can not contain null elements.
// uses resizable array.
// Generally better performance for queue oprations.

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDequeEx{
    public static void main(String[] args) {
        Queue<String> q1 = new ArrayDeque<>();

        q1.add("Shiv");
        q1.add("Raj");
        q1.add("kaudare");

        System.out.println(q1);

        Iterator<String> itr = q1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}