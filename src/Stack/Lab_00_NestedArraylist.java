package Stack;

import java.util.ArrayList;
import java.util.List;

public class Lab_00_NestedArraylist {
    public static void main(String[] args){

        List fruit1 = new ArrayList();
        fruit1.add("Mango");
        fruit1.add("Grapes");
        fruit1.add("Apple");
        System.out.println(fruit1);

        List fruit2 = new ArrayList();
        fruit2.add("Watermelon");
        fruit2.add("papaya")   ;
        fruit2.add("Muskmelon");
        System.out.println(fruit1);

               List vegetables = new ArrayList();
               vegetables.add("Tomato");
               vegetables.add("onion");
               vegetables.add("potato");
        System.out.println(vegetables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruit1);
        all_fruits.add(fruit2);
        all_fruits.add(vegetables) ;
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(1));


    }
}
