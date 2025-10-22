package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList(10);
        list.add("1");
        list.add("2");
        list.add(true);
        list.add("7");
        list.add("7");
        list.add("Sufi");
        list.add("09");
        list.add("7");

        System.out.println(list.size());          // Prints total size
        System.out.println(list.isEmpty());       // Checks if list is empty
        System.out.println(list.contains(7));     // false (because 7 is not a String)
        System.out.println(list.contains("2"));   // true
        System.out.println(list.indexOf("7"));    // first index of "7"
        System.out.println(list.lastIndexOf("7"));// last index of "7"

        System.out.println(list);
        System.out.println("-------------------");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
            list.set(2, false);
            System.out.println(list);

            list.remove(0);
        System.out.println(list);

            list.clear();
            System.out.println(list);

        }
    }


