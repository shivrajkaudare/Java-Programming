import java.util.*;

// Iterator it is object that used to loop through Collection's.
// ex. list , map, set .

public class IteratorEx {
      public static void main(String args[]){

          LinkedList<String> li = new LinkedList<String>();
                  li.add("Shiv");
                  li.add("Nikeeta");
                  li.add("Deepak");
                  li.add("Shivraj");

        // Iterator for print list elements
        Iterator<String> itr = li.iterator();

        while(itr.hasNext()) {

          System.out.println(itr.next());
      }
}
}
  
