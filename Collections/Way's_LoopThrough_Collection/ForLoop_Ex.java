import java.util.*;

// For loop is used to loop through Collection's.
// ex. list , map, set .

public class ForLoop_Ex {
      public static void main(String args[]){

          LinkedList<String> li = new LinkedList<String>();
                  li.add("Shiv");
                  li.add("Nikeeta");
                  li.add("Deepak");
                  li.add("Shivraj");

          for(String elements : li){
            
            System.out.println(elements);
          }
      }
}
