package Stack;

import java.util.*;

public class Lab_HS_LHS_THS_Java {
    public static void main(String[] args){

        Set <String> hs  = new HashSet();
        hs.add("Sufi");
        hs.add("Maldar");
        hs.add("Sohail");
        hs.add("Maldar");
        hs.add("null");
        System.out.println(hs);
        System.out.println(hs.isEmpty());
       hs.add("Sufiyan");
        System.out.println(hs);
        System.out.println("----------------------------");

        Set lhs = new LinkedHashSet();
        lhs.add("Azzu");
        lhs.add("Sufi");
        lhs.add("Mohammed");
        lhs.add("SSS");
        System.out.println(lhs);

        System.out.println("-----------------------");

        Set ts = new TreeSet();
        ts.add("apple");
        ts.add("Mango");
        ts.add("Apple");
        ts.add("Banana");
        ts.add("orange");
        ts.add("null");
        System.out.println(ts);

      //  Iterator iterator = ts.iterator();
      //  while(iterator.hasNext());
     //   System.out.println(iterator.next());

        for(Object o : ts){
            System.out.println(o);
        }
    }
}
