// TreeMap is implement Map interface.
// TreeMap does not allowed any null key or value.
// TreeMap does not allow duplicate keys.
//  it contain values along with keys.
import java.util.*;
public class TreeMapExample{
    public static void main(String[] args) {
        
          TreeMap<Integer, String> t = new TreeMap<>();

                t.put(null, null);
                t.put(1, "Shivraj");
                t.put(2, "Raj");
                t.put(3,"Kaudare");

          for(Map.Entry m : t.entrySet()){
                 System.out.println(m.getKey()+" "+m.getValue());
          }
    }
}