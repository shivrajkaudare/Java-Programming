// LinkedHashMap implement Map interface and extends HashMap class.
// linkedHashMap is similer to HashMap but it have additional feature that it maintain inesertion order because,
// it internally uses doubly LinkedList.
// it is non-Synchronized (not thread Safe).
// can have one null key and multiple null values.

import java.util.*;
public class LinkedHashMapEx {
     public static void main(String[] args) {
        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
                 
                   lm.put(1,"abc");
                   lm.put(null, null);
                   lm.put(2, null);
                   lm.put(3, "xyz");
                   lm.put(4, "shiv");

        for(Map.Entry m : lm.entrySet()){
            
            System.out.println(m.getKey()+" "+m.getValue());
        }
     }
}