// TreeSet class contains unique elements only like HashSet.

// TreeSet class access and retrieval times are quiet fast.

// TreeSet class doesn't allow null element.

// TreeSet class maintains ascending order.

import java.util.*;

public class TreeSetExample{ 

    public static void main(String args[]) { 

          TreeSet<String> al=new TreeSet<String>(); 
                    al.add("Liam"); 
                    al.add("Noah"); 
                    al.add("Oliver"); 
                    al.add("Elijah"); 

          Iterator<String> itr = al.iterator();
          while(itr.hasNext()) { 

                 System.out.println(itr.next()); 
          } 
      } 

}
