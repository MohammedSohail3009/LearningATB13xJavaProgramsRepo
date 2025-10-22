package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_AL_Interview {
    public static void main (String[] args){
        List marks = new ArrayList();
        marks.add(92);
        marks.add(98);
        marks.add(78);
        marks.add(79);
        marks.add(75);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.reverse(marks);
        System.out.println(marks);
    }
}
