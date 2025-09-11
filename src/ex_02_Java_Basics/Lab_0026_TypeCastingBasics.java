package ex_02_Java_Basics;

public class Lab_0026_TypeCastingBasics {
    public static void main(String args[]){
        int course = 100;
        float GST = 18.45f;
       int total1 = course+(int)GST; //Narrow - Implicit
        System.out.println(total1);
        float total2 = course+GST;
        float total3 = (float)course+GST;  // Widening Explictly
        System.out.println(total2);
        System.out.println(total3);
    }
}
