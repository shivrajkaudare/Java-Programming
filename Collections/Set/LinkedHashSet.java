// LinkedHashSet implement both linkedlist as well as hashtable.
// it maintain insertion order.
// it allows null values.
// it shows properties of both linkedlist and hashtable.

import java.util.*;

class LinkedHashSetExample{
    public static void main(String[] args) {
        LinkedHashSet <String> ls = new LinkedHashSet<String>();

            ls.add("abc");
            ls.add("pqr");
            ls.add("xyz");
            ls.add("nqt");

          System.out.println(ls);

          Iterator<String> itr = ls.iterator();

        while(itr.hasNext()){
            String el = itr.next();
            System.out.println(el);
        }

                
            }
    }

