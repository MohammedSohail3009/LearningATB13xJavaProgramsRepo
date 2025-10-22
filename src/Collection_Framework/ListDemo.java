package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Sufi");
        arrayList.add(null);
        arrayList.add("Maldar");
        arrayList.add("Maldar");
        arrayList.add(12345);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l1 = new ArrayList();
        l1.add("sohail");
        l1.add("Maldar");
        System.out.println(l1);
        System.out.println(l1.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
