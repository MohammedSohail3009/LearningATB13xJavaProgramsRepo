package Stack;

import java.util.*;

public class DSA_Realtime_Excerise_Java {
    public static void main(String[] args){
        Map <String,Object> student1 = new HashMap<>();
        student1.put("name","sohail");
        student1.put("phone",8143223875l);
        student1.put("address","Bangalore");

        Map<String,Object> student2 = new HashMap<>();
        student2.put("name","sufi");
        student2.put("phone",7989099608l);
        student2.put("address","Hyd");

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
