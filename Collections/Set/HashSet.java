// HashSetstores the elements by using a mechanism called hashing.
// HashSetcontains unique elements only.
// HashSetallows null value.
// HashSetdoesn't maintain the insertion order.
// HashSetis the best approach for search operations.

import java.util.*;

public class sample {  
  public static void main(String args[]) {  
       HashSet <String> s = newHashSet(); 
         s.add("Liam");    
         s.add("Noah");    
         s.add("Oliver");   
         s.add("Elijah");
      Iterator <String> i = s.iterator();  
      while(i.hasNext())  {  
        System.out.println(i.next());  
      } 
 }  
}
