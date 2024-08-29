import java.util.*;

// for Each method with lambda expression is used to loop through Collection's.
// ex. list , map, set .

public class ForEachMethod_Ex {
      public static void main(String args[]){

          LinkedList<String> li = new LinkedList<String>();
                  li.add("Shiv");
                  li.add("Nikeeta");
                  li.add("Deepak");
                  li.add("Shivraj");

        li.forEach(elements -> {
            System.out.println(elements);
          
      });
      }
}
