package Collection_Framework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args){

        List mylist = new LinkedList();
        mylist.add("Sufi");
        mylist.add("Maldar");
        mylist.add(123);
        mylist.add("New Chapter");
        mylist.add("456");
        System.out.println(mylist);
        System.out.println(mylist.isEmpty());
        System.out.println(mylist.contains(123));

    }
}
