// HashMAp contains Values Based on Keys.
// HashMap is Non-Synchronised i.e not thread Safe- Can not be share in multiple threads.
// HashMap contain one null key and multiple null values.
// does not allow duplicate key but can have multiple duplicate values.

import java.util.*;

public class HashMapExample{
    public static void main(String args []){
           HashMap<Integer, String> h = new HashMap<Integer, String>();

                    h.put(1, "Shiv");
                    h.put(2, "Raj");
                    h.put(3, "Shivraj");
                    h.put(4, "Kaudare");
            for(Map.Entry m : h.entrySet()){

                System.out.println(m.getKey()+" "+m.getValue());

            }
    }

}