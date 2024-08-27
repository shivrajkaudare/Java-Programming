// Map contains values based on keys (key and value pair).
// Map contains Unique elements.
// Map does not duplicate keys but can have duplicate values.
// HashMap, LinkedHashMap can allow one null key and multiple null Values but TreeMap does not allow any null key and value.
import java.util.*;

public class MapExample{
    public static void main(String args []){
        Map<Integer, String> m = new HashMap<Integer, String>();
              m.put(1, "abc");
              m.put(2, "pqr");
              m.put(3, "xyz");
              m.put(4, "nqt");
              

            for(Map.Entry m1 : m.entrySet()){
                System.out.println(m1.getKey()+" "+m1.getValue());
            }

    }
}
