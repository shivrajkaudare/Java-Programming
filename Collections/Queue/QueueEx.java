package Collections.Queue;
 import java.util.*;
// Queue is a interface (Data Structure) that present in java.util package and it extends Collection interface.
// Use FIFO(First In First Out) Algorithm for inserting and deleting element.
public class QueueEx {
    public static void main(String args[]){
      // LinkeddList Class is also implements Que interface

      Queue<String> q1 = new LinkedList<>();

           q1.add("Shivaraj");
           q1.add("raj");
           q1.add("kaudare");

           System.out.println(q1);


          q1.forEach(elements ->{
              System.out.println(elements);
           });

        
    }
    
}
