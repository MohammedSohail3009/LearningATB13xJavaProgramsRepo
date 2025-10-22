package Stack;

import java.util.*;



public class DSA_Map_Java {
    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("Tesla",1);
        vehicles.put("BMW",2);
        vehicles.put("Audi",3);
        vehicles.put("Activa",1);
        System.out.println("Total vehicle: " + vehicles.size());

       for(String Key: vehicles.keySet()){
           System.out.println(Key + " -> " + vehicles.get(Key));
       }
       //checking if key exists
       if(vehicles.containsKey("Audi")){
           System.out.println("Yes");
       }else
           System.out.println("No");

    }
}
