// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet doesn't maintain the insertion order.
// HashSet is the best approach for search operations.import java.util.*;

public class HashSetExample { 

public static void main(String args[]) { 

      HashSet<String> s=new HashSet(); 
           s.add("Liam"); 
           s.add("Noah"); 
           s.add("Oliver"); 
           s.add("Elijah");
      Iterator<String> i=s.iterator(); 
  while(i.hasNext()) { 
     System.out.println(i.next()); 
  } 
 } 

}
